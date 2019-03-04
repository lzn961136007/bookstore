package com.bs.mall.util;

import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import com.github.wxpay.sdk.WXPayConstants.SignType;

/**
 * 微信支付工具类    
 * @author KaiserZ
 *
 */
public class OrderUtils {
	private static final String CHARS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final Random RANDOM = new SecureRandom(); 
	//生成随机字符串
	public static String generateNonceStr(){
		char[] nonceChar = new char[32];
		for (int i = 0; i < nonceChar.length; i++) {
			nonceChar[i] = CHARS.charAt(RANDOM.nextInt(CHARS.length()));
		}
		return new String(nonceChar);
	} 
	
	/**
	 * 生成签名
	 * @param map 参加签名的字段
	 * @param key 商户密匙
	 * @param signType 加密方式
	 * @return 签名
	 * @throws Exception 
	 */
	public static String generateSign(final Map<String,String> map,String key,SignType signType) throws Exception{
		Set<String> keySet = map.keySet();
		String[] array = keySet.toArray(new String[keySet.size()]);
		Arrays.sort(array);
		StringBuffer sb = new StringBuffer();
		for (String str : array) {
			if(str.equals("sign")){
				continue;
			}
			if(map.get(str).trim().length()>0){
				sb.append(str).append("=").append(map.get(str).trim()).append("&");
			}
		}
		sb.append("key=").append(key);
		if (SignType.MD5.equals(signType)) {
            return MD5(sb.toString()).toUpperCase();
        }
        else if (SignType.HMACSHA256.equals(signType)) {
            return HMACSHA256(sb.toString(), key);
        }
        else {
            throw new Exception(String.format("无效的加密方式: %s", signType));
        }
	}
	
	//时间戳
	//当前时间（毫秒）
	public static long getCurrentTimestampMs(){
		return System.currentTimeMillis();
	}
	//当前时间(秒)
	public static long getCurrentTimestamp(){
		return System.currentTimeMillis()/1000;
	}
	
	//MD5生成数据
	public static String MD5(String data) throws Exception{
		MessageDigest digest = MessageDigest.getInstance("MD5");
		byte[] dataByte = digest.digest(data.getBytes("UTF-8"));
		StringBuilder sb = new StringBuilder();
		for (byte b : dataByte) {
			sb.append(Integer.toHexString((b & 0xFF) | 0x100).substring(1,3));
		}
		return sb.toString().toUpperCase();
	}
	/**
     * 生成 HMACSHA256
     * @param data 待处理数据
     * @param key 密钥
     * @return 加密结果
     * @throws Exception
     */
    public static String HMACSHA256(String data, String key) throws Exception {
        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        SecretKeySpec secret_key = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");
        sha256_HMAC.init(secret_key);
        byte[] array = sha256_HMAC.doFinal(data.getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder();
        for (byte item : array) {
            sb.append(Integer.toHexString((item & 0xFF) | 0x100).substring(1, 3));
        }
        return sb.toString().toUpperCase();
    }
    
    
}

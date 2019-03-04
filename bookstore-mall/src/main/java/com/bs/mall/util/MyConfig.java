package com.bs.mall.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.github.wxpay.sdk.WXPayConfig;
/**
 * 微信支付配置类，读取微信支付所需要的appid,商户id和商户密钥
 * @author Kaiser
 *
 */

@Component
public class MyConfig implements WXPayConfig{
	@Value("${appid}")
	private String appid;
	@Value("${mch_id}")
	private String mch_id;
	@Value("${mch_key}")
	private String mch_key;
	
	private byte[] certData;

    public MyConfig() throws Exception {
        String certPath = this.getClass().getClassLoader().getResource("apiclient_cert.p12").getPath();
        File file = new File(certPath);
        InputStream certStream = new FileInputStream(file);
        this.certData = new byte[(int) file.length()];
        certStream.read(this.certData);
        certStream.close();
    }

    public InputStream getCertStream() {
        ByteArrayInputStream certBis = new ByteArrayInputStream(this.certData);
        return certBis;
    }

	@Override
	public String getAppID() {
		return appid;
	}

	@Override
	public int getHttpConnectTimeoutMs() {
		return 8000;
	}

	@Override
	public int getHttpReadTimeoutMs() {
		return 10000;
	}

	@Override
	public String getKey() {
		return mch_key;
	}

	@Override
	public String getMchID() {
		return mch_id;
	}

}

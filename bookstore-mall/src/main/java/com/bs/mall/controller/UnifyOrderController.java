package com.bs.mall.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bs.mall.util.MyConfig;
import com.github.wxpay.sdk.WXPay;

/**
 * 微信的统一下单
 * @author KaiserZ
 *
 */
@RestController
public class UnifyOrderController {
	@Value("${notify_url}")
	private String notify_url;
	@Value("${trade_type}")
	private String trade_type;
	@Value("${fee_type}")
	private String fee_type;
	@Value("${sign_type}")
	private String sign_type;
	@Resource
	private MyConfig config;
	//统一下单回调地址
	@RequestMapping("pay")
	public void payResponse(){
	}
	
	//下单
	@GetMapping("oreder/{body}/{detail}/{out_trade_no}/{total_fee}/{spbill_create_ip}/{openid}")
	public Map<String,String> createOrder(@PathVariable("body") String body,@PathVariable("detail") String detail,
			@PathVariable("out_trade_no") String out_trade_no,@PathVariable("total_fee") String total_fee,
			@PathVariable("spbill_create_ip") String spbill_create_ip,@PathVariable("openid") String openid) throws Exception{
		Map<String,String> data = new HashMap<>();
		WXPay pay = new WXPay(config);
		data.put("body", body);
		data.put("out_trade_no", out_trade_no);
		data.put("total_fee", total_fee);
		data.put("spbill_create_ip", spbill_create_ip);
		data.put("notify_url", notify_url);
		data.put("trade_type", trade_type);
		data.put("openid", openid);
		data.put("detail", detail);
		data.put("sign_type", sign_type);
		Map<String, String> map = pay.unifiedOrder(data);
		return map;
	}
	
	//申请退款
	@GetMapping("refund/{orderNumber}/{out_refund_no}/{total_fee}/{refund_fee}/{refund_desc}")
	public Map<String,String> refound(@PathVariable("orderNumber")String orderNumber,@PathVariable("out_refund_no")String out_refund_no,@PathVariable("total_fee")String total_fee,
			@PathVariable("refund_fee")String refund_fee,@PathVariable("refund_desc")String refund_desc) throws Exception{
		Map<String,String> data = new HashMap<>();
		WXPay pay = new WXPay(config);
		data.put("orderNumber", orderNumber);
		data.put("out_refund_no", out_refund_no);
		data.put("total_fee", total_fee);
		data.put("refund_fee", refund_fee);
		data.put("refund_desc", refund_desc);
		Map<String, String> map = pay.refund(data);
		return map;
	}
	
	//查询订单
	@GetMapping("orderQuery/{orderNumber}")
	public Map<String,String> orderQuery(@PathVariable("orderNumber") String orderNumber) throws Exception{
		Map<String,String> data = new HashMap<>();
		WXPay pay = new WXPay(config);
		data.put("orderNumber", orderNumber);
		Map<String, String> map = pay.orderQuery(data);
		return map;
	}
	
	//退款查询
	@GetMapping("refoundQuery/{refondNumber}")
	public Map<String,String> refoundQuery(@PathVariable("refondNumber") String refondNumber) throws Exception{
		Map<String,String> data = new HashMap<>();
		WXPay pay = new WXPay(config);
		data.put("refondNumber", refondNumber);
		Map<String, String> map = pay.orderQuery(data);
		return map;
	}
	
}

package com.bs.mall.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.bs.mall.util.NetVisit;
/**
 * 从微信小程序获取登陆code然后返回微信支付所需要openid、session_key等等信息 
 * @author KaiserZ
 *  
 */
@RestController
public class GetWxUserInfoController {
	@Value("${appid}")//需要在application.xml和springMVC.xml中加载扫描配置
	private String wx_appid;
	@Value("${secret}")
	private String wx_secret;
	@Value("${grant_type}")
	private String wx_grant_type;
	@Value("${wxUrl}")
	private String wx_url;
	@GetMapping("getopenid/{code}")
	public JSONObject getWxinfo(@PathVariable("code") String code){
		boolean boo = StringUtils.isEmpty(code);
		if(boo){
			return JSONObject.parseObject("参数错误！");
		}
		StringBuffer sb = new StringBuffer(wx_url);
		sb.append(String.format("?appid=%s", wx_appid));
		sb.append(String.format("&secret=%s", wx_secret));
		sb.append(String.format("&js_code=%s", code));
		sb.append(String.format("&grant_type=%s", wx_grant_type));
		String info = NetVisit.getNetInfo(sb.toString());
		return JSONObject.parseObject(info);		
	}
}

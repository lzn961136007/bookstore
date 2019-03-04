package com.bs.mall.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bs.mall.pojo.Cart;
import com.bs.mall.pojo.CreateOrder;
import com.bs.mall.pojo.ReceiveAddress;
import com.bs.mall.service.CreateOrderService;

@Controller
public class CreateOrderController {
	@Autowired
	private CreateOrderService cs;
/**
 * 将用户的订单添加单数据库中
 * @param request
 * @param response
 * @param order
 * @return
 */
	@RequestMapping(value="creatOrder")
	public @ResponseBody boolean creatOrder(HttpServletRequest request,HttpServletResponse response,@RequestBody  CreateOrder order) {
		System.out.println(order);
		return cs.addOrder(order);
	}

	/**
	 * 添加订单收货地址
	 * @param request
	 * @param response
	 * @param receiveAddress
	 * @return
	 */
	@RequestMapping(value="addOrderAddress")
	public @ResponseBody boolean addOrderAddress(HttpServletRequest request,HttpServletResponse response,@RequestBody  ReceiveAddress address) {
		System.out.println(address);			
		return cs.addOrderAddress(address);	
	}
	/**
	 * 支付成功添加用户积分
	 * @param score
	 * @param userId
	 * @return
	 */
	@GetMapping("/addUserScore/{score}/{userId}")
	public @ResponseBody boolean addUserScore(@PathVariable("score") Double score,@PathVariable("userId") Integer userId) {
		
	
		return cs.addUserScore(score,userId);
	}
	
}

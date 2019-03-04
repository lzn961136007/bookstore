package com.bs.mall.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bs.mall.pojo.Order;
import com.bs.mall.pojo.OrderDetail;
import com.bs.mall.service.ManagerOrderService;

@Controller
public class ManagerOrderController {
	@Autowired
	private ManagerOrderService ms;
	/**
	 * 查询用户订单
	 * @param userId
	 * @return
	 */
	@GetMapping("/selectOrders/{userId}")
	public @ResponseBody List<Order> selectUserOrder(@PathVariable("userId") Integer userId) {
		return ms.getOrderByUserIds(userId);
	}
	
	
	@GetMapping("selectOrderNoComment/{userId}")
	public @ResponseBody List<Order> selectOrderNoComment(@PathVariable("userId") Integer userId) {
		return ms.getOrderNoComment(userId);
	}
	/**
	 * 修改用户订单状态
	 * @param orderId
	 * @param orderStatus
	 * @return
	 */
	@GetMapping("/updateOrders/{orderId}/{orderStatus}")
	public @ResponseBody Boolean updateOrder(@PathVariable("orderId") String orderId,@PathVariable("orderStatus") String orderStatus) {
		System.out.println(orderId+":"+orderStatus);
		return ms.updateOrders(orderId, orderStatus);
	}
	/**
	 * 查询指定订单的详细信息
	 * @param orderId
	 * @param userId
	 * @return
	 */
	@GetMapping("/getOrderDetails/{orderId}/{userId}")
	public @ResponseBody OrderDetail getOrderDetails(@PathVariable("orderId") String orderId,@PathVariable("userId") Integer userId) {
		return ms.getOrderDetails(orderId,userId);
	}
}

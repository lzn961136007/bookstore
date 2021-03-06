package com.bs.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.mall.dao.ManagerOrderDao;
import com.bs.mall.pojo.Book;
import com.bs.mall.pojo.Order;
import com.bs.mall.pojo.OrderDetail;
import com.bs.mall.service.ManagerOrderService;
@Service
public class ManagerOrderServiceImpl implements ManagerOrderService {
	@Autowired
	private ManagerOrderDao md;

	@Override
	public List<Order> getOrderByUserIds(Integer userId) {
		//首先查询用户所有订单号，状态，及总价
		
		return md.getOrderUserId(userId);
	}

	@Override
	public boolean updateOrders(String orderId, String orderStatus) {
		if(md.updateOrders(orderId,orderStatus)!=0){
			return true;
		}
		return false;
	}

	/**
	 * 查询订单的详细信息
	 */
	@Override
	public OrderDetail getOrderDetails(String orderId, Integer userId) {
		//查询指定订单的详细信息
		OrderDetail orderDetails = md.getOrderDetails(orderId,userId);
		//查询指定订单下的所有商品信息
		List<Book>books=md.getAllOrderBooks(orderId,userId);
		orderDetails.setBooks(books);
		
		return orderDetails;
	}

	@Override
	public List<Order> getOrderNoComment(Integer userId) {
		return md.getOrderNoComment(userId);
	}

	
}

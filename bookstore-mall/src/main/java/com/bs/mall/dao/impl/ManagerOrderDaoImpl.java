package com.bs.mall.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bs.mall.dao.ManagerOrderDao;
import com.bs.mall.mapper.ManagerOrderMapper;
import com.bs.mall.pojo.Book;
import com.bs.mall.pojo.Order;
import com.bs.mall.pojo.OrderDetail;
import com.bs.mall.util.BookStoreConstant;
@Repository
public class ManagerOrderDaoImpl implements ManagerOrderDao {
	@Autowired
	private ManagerOrderMapper mm;
	//查询所有订单及其商品
	@Override
	public List<Order> getOrderUserId(Integer userId) {
		
		return mm.getOrderUserId(userId);
	}

	@Override
	public Integer updateOrders(String orderId, String orderStatus) {
		return mm.updateOrders(orderId,orderStatus);
	}

	/**
	 * 查询指定订单的详细信息
	 */
	@Override
	public OrderDetail getOrderDetails(String orderId, Integer userId) {
		return mm.getOrderDetails(orderId,userId);
	}

	@Override
	public List<Book> getAllOrderBooks(String orderId, Integer userId) {
		return mm.getAllOrderBooks(orderId,userId);
	}

	@Override
	public List<Order> getOrderNoComment(Integer userId) {
		return mm.getOrderNoComment(userId, BookStoreConstant.ORDER_STATUS);
	}
	

}

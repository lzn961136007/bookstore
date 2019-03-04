package com.bs.mall.dao.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bs.mall.dao.CreateOrderDao;
import com.bs.mall.mapper.CreateOrderMapper;
import com.bs.mall.pojo.Cart;
import com.bs.mall.pojo.CreateOrder;
import com.bs.mall.pojo.ReceiveAddress;
@Repository
public class CreateOrderDaoImpl implements CreateOrderDao {
	@Autowired
	private CreateOrderMapper cm;

	@Override
	public Integer addOrder(CreateOrder order) {
		return cm.insertOrder(order);
	}

	@Override
	public Integer addOrderToBookId(List<Cart> carts, String orderId) {
		
		return cm.addOrderToBookId(carts,orderId);
	}

	@Override
	public Integer insertOrderAddress(ReceiveAddress address) {
		return cm.insertOrderAddress(address);
	}

	@Override
	public Integer insertUserScore(Double score, Integer userId) {
		
		return cm.insertUserScore(score,userId);
	}

	

}

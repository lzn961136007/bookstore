package com.bs.mall.dao;


import java.util.List;

import com.bs.mall.pojo.Cart;
import com.bs.mall.pojo.CreateOrder;
import com.bs.mall.pojo.ReceiveAddress;

public interface CreateOrderDao {

	Integer addOrder(CreateOrder order);

	Integer addOrderToBookId(List<Cart> carts, String orderId);

	Integer insertOrderAddress(ReceiveAddress address);

	Integer insertUserScore(Double score, Integer userId);

}

package com.bs.mall.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.mall.pojo.Book;
import com.bs.mall.pojo.Order;
import com.bs.mall.pojo.OrderDetail;

public interface ManagerOrderMapper {

	List<Order> getOrderUserId(@Param("userId")Integer userId);

	Integer updateOrders(@Param("orderId")String orderId,@Param("orderStatus") String orderStatus);

	OrderDetail getOrderDetails(@Param("orderId")String orderId, @Param("userId")Integer userId);
	//查询指定订单下所有的商品信息
	List<Book> getAllOrderBooks(@Param("orderId")String orderId, @Param("userId")Integer userId);

	List<Order> getOrderNoComment(@Param("userId")Integer userId,@Param("orderStatus")Integer orderStatus);
}

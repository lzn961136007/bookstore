package com.bs.mall.service;


import com.bs.mall.pojo.Order;
import com.bs.mall.pojo.OrderComment;

public interface OrderCommentService {

	boolean insertOrderComment(OrderComment evalution);

	Order referBookCommentDetail(String orderId, Integer bookId);

}

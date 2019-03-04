package com.bs.mall.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.mall.dao.OrderCommentDao;
import com.bs.mall.pojo.Author;
import com.bs.mall.pojo.Order;
import com.bs.mall.pojo.OrderComment;
import com.bs.mall.service.OrderCommentService;
@Service
public class OrderCommentServiceImpl implements OrderCommentService {
	@Autowired
	private OrderCommentDao od;

	@Override
	public boolean insertOrderComment(OrderComment evalution) {
		if(od.addOrderComment(evalution)==1){
			return true;
		}
		return false;
	}
	//查询用户评价商品的详细信息
	@Override
	public Order referBookCommentDetail(String orderId, Integer bookId) {
		
		//查询书籍的作者
	List<Author> author=od.referBookOfAuthor(bookId);
	//查询用户评价商品的详细信息
	Order bookCommentDetail = od.referBookCommentDetail(orderId,bookId);
	
	bookCommentDetail.setBookAuthor(author);
	
		return bookCommentDetail;
	}
	
	
}

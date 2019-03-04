package com.bs.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.mall.dao.CommentDao;
import com.bs.mall.pojo.Comment;
import com.bs.mall.pojo.OrderComment;
import com.bs.mall.service.CommentService;
@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	private CommentDao cd;
	@Override
	public List<Comment> getCommentByUserId(Integer userId) {
		return cd.referCommentByUserId(userId);
	}
	@Override
	public Boolean deleteComment(Integer userId, Integer bookId) {
		Integer comment = cd.removeComment(userId, bookId);
		return comment>0?true:false;
	}
	@Override
	public List<OrderComment> getOrderCommentByUserId(Integer userId) {
		return cd.referOrderCommentByUserId(userId);
	}
	@Override
	public Boolean deleteOrderComment(Integer userId, String orderId) {
		Integer orderComment = cd.removeOrderComment(userId, orderId);
		return orderComment>0?true:false;
	}
	@Override
	public Boolean deleteReplyComment(Integer userId, Integer bookId) {
		Integer integer = cd.removeReplyComment(userId, bookId);
		return integer>0?true:false;
	}

}

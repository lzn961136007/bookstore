package com.bs.mall.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bs.mall.dao.CommentDao;
import com.bs.mall.mapper.CommentMapper;
import com.bs.mall.pojo.Comment;
import com.bs.mall.pojo.OrderComment;
@Repository
public class CommentDaoImpl implements CommentDao {
	@Autowired
	private CommentMapper cm;
	@Override
	public List<Comment> referCommentByUserId(Integer userId) {
		return cm.selectCommentInfo(userId);
	}
	@Override
	public Integer removeComment(Integer userId, Integer bookId) {
		return cm.cancelComment(userId, bookId);
	}
	@Override
	public List<OrderComment> referOrderCommentByUserId(Integer userId) {
		return cm.selectOrderCommentInfo(userId);
	}
	@Override
	public Integer removeOrderComment(Integer userId, String orderId) {
		return cm.cancelOrderComment(userId, orderId);
	}
	@Override
	public Integer removeReplyComment(Integer userId, Integer bookId) {
		return cm.cancelReplyComment(userId, bookId);
	}

}

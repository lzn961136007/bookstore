package com.bs.mall.dao;

import java.util.List;

import com.bs.mall.pojo.Comment;
import com.bs.mall.pojo.OrderComment;

public interface CommentDao {
	List<Comment> referCommentByUserId(Integer userId);
	Integer removeComment(Integer userId,Integer bookId);
	List<OrderComment> referOrderCommentByUserId(Integer userId);
	Integer removeOrderComment(Integer userId,String orderId);
	//删除追评
	Integer removeReplyComment(Integer userId,Integer bookId);
}

package com.bs.mall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.mall.pojo.Comment;
import com.bs.mall.pojo.OrderComment;

public interface CommentMapper {
	List<Comment> selectCommentInfo(Integer userId);
	Integer cancelComment(@Param("userId") Integer userId,@Param("bookId") Integer bookId);
	List<OrderComment> selectOrderCommentInfo(Integer userId);
	Integer cancelOrderComment(@Param("userId") Integer userId,@Param("orderId") String orderId);
	//删除追评
	Integer cancelReplyComment(@Param("userId") Integer userId,@Param("bookId") Integer bookId);
}

package com.bs.mall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bs.mall.pojo.Comment;
import com.bs.mall.pojo.OrderComment;
import com.bs.mall.service.CommentService;
import com.bs.mall.util.JsonData;

@RestController
public class CommentController {
	@Autowired
	private CommentService cs;
	/**
	 * 
	 * @param userId 用户ID
	 * @return 评论信息
	 */
	@GetMapping("{userId}/comment")
	public List<Comment> findCommentByUserId(@PathVariable("userId") Integer userId){
		return cs.getCommentByUserId(userId);
	}
	@GetMapping("deletecomment/{userId}/{bookId}")
	public JsonData deleteComment(@PathVariable("userId") Integer userId,@PathVariable("bookId") Integer bookId){
		Boolean status = cs.deleteComment(userId, bookId);
		return status?new JsonData(null, null, "删除成功", status):new JsonData(null, null, "删除失败", status);
	}
	//删除追评
	@GetMapping("deleteReplyComment/{userId}/{bookId}")
	public JsonData deleteReplyComment(@PathVariable("userId") Integer userId,@PathVariable("bookId") Integer bookId){
		Boolean replyComment = cs.deleteReplyComment(userId, bookId);
		return replyComment?new JsonData(null, null, "删除成功", replyComment):new JsonData(null, null, "删除失败", replyComment);
	}
	@GetMapping("allOrderComment/{userId}")
	public List<OrderComment> findOrderComment(@PathVariable("userId") Integer userId){
		return cs.getOrderCommentByUserId(userId);
	}
	@GetMapping("deleteOrderComment/{userId}/{orderId}")
	public JsonData deleteComment(@PathVariable("userId") Integer userId,@PathVariable("orderId") String orderId){
		Boolean status = cs.deleteOrderComment(userId, orderId);
		return new JsonData(null, null, "删除成功", status);
	}
}

package com.bs.mall.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.mall.pojo.Author;
import com.bs.mall.pojo.Order;
import com.bs.mall.pojo.OrderComment;

public interface OrderCommentMapper {
	//将用户的评价表提交到数据库中	
	Integer addOrderComment(@Param("evalution")OrderComment evalution);
	//获取用户评价商品的详细信息
	Order selectBookCommentDetail(@Param("orderId")String orderId,@Param("bookId") Integer bookId);
	
	//查询书籍的作者
	List<Author> selectBookOfAuthor(@Param("bookId")Integer bookId);
	
}

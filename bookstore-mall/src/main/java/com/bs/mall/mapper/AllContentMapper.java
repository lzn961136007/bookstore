package com.bs.mall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.mall.pojo.Activity;
import com.bs.mall.pojo.AllContent;
import com.bs.mall.pojo.Category;
import com.bs.mall.pojo.Collector;
import com.bs.mall.pojo.Comment;

public interface AllContentMapper {
//	根据书的id查询所有书和作者，销量的数据
	List<AllContent> selectDetailById(Integer bookId);
//	根据书的id查询评论
	List<Comment> selectAllById(Integer bookId);
//	添加收藏
	Integer insertAddBook(@Param("userId")Integer userId,@Param("bookId")Integer bookId);
//	判断收藏是否存在
	Collector getIsExist(@Param("userId")Integer userId,@Param("bookId")Integer bookId);
//	分类左侧只显示的分类
	List<Category> selectClassifyById();
//	点击分类显示书名，金额
	List<AllContent> selectAllBookId(String bookCategory);
//	显示所有书名和图片
	List<AllContent> selectAllBook();
//	查询书id对应的折扣
	List<Activity> selectActivity(Integer bookId);
//	查询书的所有作者
	List<AllContent> selectAllAuthor(Integer bookId);
//	添加评论
	Integer insertAddComment(@Param("userId")Integer userId,@Param("bookId")Integer bookId,@Param("commentContent")String commentContent,@Param("commentDataTime")String commentDataTime);
//	追加评论
	Integer updateCommentReply(@Param("userId")Integer userId,@Param("bookId")Integer bookId,@Param("commentReply")String commentReply,@Param("commentReplyDataTime")String commentReplyDataTime);
//	查看库存
	List<AllContent> selectStockNum(Integer bookId);
} 

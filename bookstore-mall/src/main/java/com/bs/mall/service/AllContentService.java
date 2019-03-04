package com.bs.mall.service;

import java.util.List;

import com.bs.mall.pojo.Activity;
import com.bs.mall.pojo.AllContent;
import com.bs.mall.pojo.Category;
import com.bs.mall.pojo.Collector;
import com.bs.mall.pojo.Comment;

public interface AllContentService {
//	根据书的id查询所有书和作者，销量的数据
	List<AllContent> getDetailByBookId(Integer bookId);
//	根据书的id查询评论
	List<Comment> getAllByBookId(Integer bookId);
//	添加收藏
	Integer getAddBook(Integer userId,Integer bookId);
//	判断是否存在
	Collector getColletcorId(Integer userId,Integer bookId);
//	分类左侧只显示的分类
	List<Category> selectClassifyById();
//	点击分类显示书名，金额
	List<AllContent> getAllBookId(String bookCategory);
//	显示所有书名和图片
	List<AllContent> getAllBook();
//	查询书id对应的折扣
	List<Activity> getActivity(Integer bookId);
//	查询书的所有作者
	List<AllContent> getAllAuthor(Integer bookId);
//	添加评论
	Integer getAllComment(Integer userId,Integer bookId,String commentContent);
//	追加评论
	Integer getAllCommentReply(Integer userId,Integer bookId,String commentReply);
//	查看库存
	List<AllContent> getStockNum(Integer bookId);
}

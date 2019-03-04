package com.bs.mall.dao;

import java.util.List;

import com.bs.mall.pojo.Book;
import com.bs.mall.pojo.BookList;
import com.bs.mall.pojo.BookTheme;
import com.bs.mall.pojo.HotBook;
import com.bs.mall.pojo.OrderInculdeBooks;

public interface BookDao {
	List<Book> referBookByPage(Integer pageNum);
	List<Book> referBookByKeyword(Integer pageNum,String keyword);
	List<Book> referFavoriteBook(Integer userId);
	List<HotBook> referHotBookByPage(Integer pageNum);
	List<Book> referBookByKind(String bookKind);
	List<Book> referBookByAuthor(String author);
	List<BookList> referBookList(Integer themeId);
	BookTheme referBookTheme(Integer themeId);
	List<OrderInculdeBooks> referOrderInculdeBooks(String orderId);
}

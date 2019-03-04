package com.bs.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bs.mall.service.UserToBookService;
import com.bs.mall.util.JsonData;

@Controller
public class UserToBookController {
	@Autowired
	private UserToBookService userFavSer;
	@GetMapping("delete/{userId}/{bookId}")
	public @ResponseBody JsonData omitUserFavorite(@PathVariable("userId") Integer userId,@PathVariable("bookId") Integer bookId){
		Boolean status = userFavSer.deleteUserFavorite(userId, bookId);
		return new JsonData(null,null,"成功删除",status);
	}
}

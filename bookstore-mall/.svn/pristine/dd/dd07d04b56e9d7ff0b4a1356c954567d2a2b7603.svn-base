package com.bs.mall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bs.mall.pojo.DiscountBook;
import com.bs.mall.service.DiscountBookService;

@RestController
public class DiscountBookController {
	@Autowired
	private DiscountBookService dbs;
	@GetMapping("alldiscount")
	public List<DiscountBook> findAll(){
		return dbs.getAllDiscountBook();
	}
}

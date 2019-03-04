package com.bs.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.mall.dao.DiscountBookDao;
import com.bs.mall.pojo.DiscountBook;
import com.bs.mall.service.DiscountBookService;
@Service
public class DiscountBookServiceImpl implements DiscountBookService {
	@Autowired
	private DiscountBookDao dbd;
	@Override
	public List<DiscountBook> getAllDiscountBook() {
		return dbd.referDiscountAllBook();
	}

}

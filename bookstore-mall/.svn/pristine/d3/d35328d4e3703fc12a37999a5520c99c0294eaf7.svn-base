package com.bs.mall.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bs.mall.dao.DiscountBookDao;
import com.bs.mall.mapper.DiscountBookMapper;
import com.bs.mall.pojo.DiscountBook;
@Repository
public class DiscountBookDaoImpl implements DiscountBookDao {
	@Autowired
	private DiscountBookMapper dbm;
	@Override
	public List<DiscountBook> referDiscountAllBook() {
		return dbm.selectAllDiscount();
	}

}

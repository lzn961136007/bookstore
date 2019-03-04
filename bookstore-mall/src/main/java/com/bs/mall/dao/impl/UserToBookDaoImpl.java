package com.bs.mall.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bs.mall.dao.UserToBookDao;
import com.bs.mall.mapper.UserToBookMapper;
@Repository
public class UserToBookDaoImpl implements UserToBookDao{
	@Autowired
	private UserToBookMapper userFav;
	@Override
	public Integer removeUserFavorite(Integer userId, Integer bookId) {
		return userFav.cancelUserFavorite(userId, bookId);
	}

}

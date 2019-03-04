package com.bs.mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.mall.dao.UserToBookDao;
import com.bs.mall.service.UserToBookService;
@Service
public class UserToBookServiceImpl implements UserToBookService {
	@Autowired
	private UserToBookDao userFavDao;
	@Override
	public Boolean deleteUserFavorite(Integer userId, Integer bookId) {
		Integer in1 = userFavDao.removeUserFavorite(userId, bookId);
		return in1>0?true:false;
	}

}

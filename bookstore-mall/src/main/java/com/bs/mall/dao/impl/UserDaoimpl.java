package com.bs.mall.dao.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.bs.mall.dao.UserDao;
import com.bs.mall.mapper.UserMapper;
import com.bs.mall.pojo.User;
import com.bs.mall.pojo.UserGetCoupon;

@Repository
public class UserDaoimpl implements UserDao{
	@Autowired
	private UserMapper userMapper;

	
	@Override
	public User selectUser(String email,String password) {
		return userMapper.getUserByUser(email,password);
	}

	@Override
	public User selectUserByExistEmail(String email) {
		return userMapper.getUSerByExistEmail(email);
	}
	
	@Override
	public User selectUserByExistName(String username) {
		return userMapper.getUSerByUserExistName(username);
	}
	
	@Override
	public Integer updateUserByStatus(String email, String active) {
		// TODO Auto-generated method stub
		return userMapper.updateByStatus(email, active);
	}


	@Override
	public Integer insertUser(String email,String username,String password,String registerDate) {
		return userMapper.addUserByUSer(email,username,password,registerDate);
	}

	@Override
	public User selectByUserPhone(String email) {
		return userMapper.getSelectByUserPhone(email);
	}

	@Override
	public Integer updateUser(String email,String password) {
		return userMapper.updateUserByUser(email,password);
	}

	@Override
	public User referUserById(Integer userId) {
		return userMapper.selectUserById(userId);
	}

	@Override
	public UserGetCoupon referUserGetCoupon(Integer userId, Integer couponId) {
		return userMapper.selectUserCoupon(userId, couponId);
	}

	@Override
	public Integer augmentUserGetCoupon(Integer userId, Integer couponId, String date) {
		return userMapper.insertCoupon(userId, couponId, date);
	}

	@Override
	public Integer renewalUserBalance(User user) {
		return userMapper.updateUserbalance(user);
	}


	
	

	@Override
	public Integer editorUserInfomation(User user) {
		return userMapper.updateUserInfomation(user);
	}

	@Override
	public String selectPhone(String phone) {
		
		return userMapper.selectPhone(phone);
	}

	
	
	
}

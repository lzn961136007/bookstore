package com.bs.mall.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bs.mall.dao.CouponDao;
import com.bs.mall.dao.UserDao;
import com.bs.mall.pojo.Coupon;
import com.bs.mall.pojo.User;
import com.bs.mall.pojo.UserGetCoupon;
import com.bs.mall.service.UserService;
import com.bs.mall.util.AppMD5Util;
import com.bs.mall.util.JsonData;
import com.bs.mall.util.JudgeUser;
import com.bs.mall.util.TimeUtil;

@Service
public class UserServiceimpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Autowired
	private CouponDao couponDao;

	//登陆
	@Override
	public User  getSelectByUser(String email,String password) {
		 return userDao.selectUser(email, password);
	}
	
	//注册时判断邮箱存在
	@Override
	public User getUserByEmail(String email) {
		return userDao.selectUserByExistEmail(email);
	}
	//注册时判断用户名存在
	@Override
	public User getUserByName(String username) {
		return userDao.selectUserByExistName(username);
	}
	
	//注册成功或修改状态
	@Override
	public Integer getUpdateByStatus(User user) {
		// TODO Auto-generated method stub
		String email = user.getEmail();
		String active = user.getActive();
		return userDao.updateUserByStatus(email, active);
	}
		//注册成功添加数据库
	@Override
	public Boolean addUser(String email,String username,String password) {
		String date =new SimpleDateFormat("YYYY-MM-dd").format(new Date());
		Integer user = userDao.insertUser(email, username,password, date);
		if(user>0){
			return true;
		}else{
			
			return false;	
		}
	}
	//修改时查询邮箱
	@Override
	public User getUserByPhone(String email) {
		return userDao.selectByUserPhone(email);
		
	}
	//修改密码
	@Override
	public Boolean getUpdateByUser(String email,String password) {
		Integer updateUser = userDao.updateUser(email,password);
		return updateUser>0?true:false;
	}
	@Override
	public Boolean getNewUser(Integer userId) {
		User user = userDao.referUserById(userId);
		return new JudgeUser().judgeUser(user);
	}
	@Override
	public Boolean getGetCoupon(Integer userId, Integer couponId) {
		UserGetCoupon referUserGetCoupon = userDao.referUserGetCoupon(userId, couponId);
		if(referUserGetCoupon!=null){
			return true;
		}else{
			return false;
		}
	}
	@Override
	public Boolean addUserGetCoupon(Integer userId, Integer couponId) {
		Integer userGetCoupon = userDao.augmentUserGetCoupon(userId, couponId, TimeUtil.getCurrentDate());
		return userGetCoupon>0?true:false;
	}
	@Transactional(rollbackFor={RuntimeException.class, Exception.class})
	@Override
	public JsonData addCouponInfo(Integer userId, Integer couponId) {
		Date date = new Date();
		Coupon coupon = couponDao.referCoupon(couponId);
		if(coupon.getCouponRemainNum() < 1){
			return new JsonData(null, null, "优惠券没有了！", false);
		}
		//时间顺序对判断有影响   
		if(!coupon.getCouponEnd().after(date)){
			return new JsonData(null,null,"优惠券已过期!",false);
		}
		if(!coupon.getCouponStart().before(date)){
			return new JsonData(null, null, "优惠活动还未开始!", false);
		}
		Integer userGetCoupon = userDao.augmentUserGetCoupon(userId, couponId, TimeUtil.getCurrentDate());
		//修改优惠券的容量
		Integer couponNum = couponDao.updateCouponNum(couponId);
		return (userGetCoupon>0&&couponNum>0)?new JsonData(null,null,"成功领取!",true):new JsonData(null,null,"领取失败!",false);
	}
//用户信息修改
	@Override
	public boolean editorUserInfomation(User user) {
		//用户密码的加密
		String password=user.getPassword();
		if(password!=null||!(password.equals(' ')))
		{
		user.setPassword(AppMD5Util.convertMD5(password));	
		}
		if(userDao.editorUserInfomation(user)==1)
		{
			return true;
		}
		return false;
	}

@Override
public boolean phoneValidate(String phone) {
	if(userDao.selectPhone(phone)!=null){
		return true;
	}

	return false;
}
	
	
}

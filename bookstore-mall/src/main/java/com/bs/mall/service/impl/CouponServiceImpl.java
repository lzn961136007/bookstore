package com.bs.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.mall.dao.CouponDao;
import com.bs.mall.pojo.Coupon;
import com.bs.mall.pojo.UserCoupon;
import com.bs.mall.pojo.UsersCoupon;
import com.bs.mall.service.CouponService;
@Service
public class CouponServiceImpl implements CouponService {
	@Autowired
	private CouponDao couponDao;
	@Override
	public List<Coupon> getAllInfo(String kind) {
		return couponDao.referAllInfo(kind);
	}
	@Override
	public List<UserCoupon> getUserCoupon(Integer userId) {
		return couponDao.referUserCoupon(userId);
	}
	@Override
	public boolean updateUserCoupons(Integer userId, Integer couponId, String couponUseTime) {
		if(couponDao.updateUserCoupons(userId,couponId,couponUseTime)==1){
			return true;
		}
		return false;
	}
	@Override
	public List<UsersCoupon> getUsersCoupon(Integer userId) {
		return couponDao.referUsersCoupon(userId);
	}

}

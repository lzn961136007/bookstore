package com.bs.mall.service;

import java.util.List;

import com.bs.mall.pojo.Coupon;
import com.bs.mall.pojo.UserCoupon;
import com.bs.mall.pojo.UsersCoupon;

public interface CouponService {
	List<Coupon> getAllInfo(String kind);

	List<UserCoupon> getUserCoupon(Integer userId);

	boolean updateUserCoupons(Integer userId, Integer couponId, String couponUseTime);
	
	List<UsersCoupon> getUsersCoupon(Integer userId);
}

package com.bs.mall.dao;

import java.util.List;

import com.bs.mall.pojo.Coupon;
import com.bs.mall.pojo.UserCoupon;
import com.bs.mall.pojo.UsersCoupon;

public interface CouponDao {
	List<Coupon> referAllInfo(String kind);
	
	Coupon referCoupon(Integer couponId);

	List<UserCoupon> referUserCoupon(Integer userId);

	Integer updateUserCoupons(Integer userId, Integer couponId, String couponUseTime);
	
	List<UsersCoupon> referUsersCoupon(Integer userId);
	
	//修改优惠券的库存量
	Integer updateCouponNum(Integer couponId);
}

package com.bs.mall.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bs.mall.dao.CouponDao;
import com.bs.mall.mapper.CouponMapper;
import com.bs.mall.pojo.Coupon;
import com.bs.mall.pojo.UserCoupon;
import com.bs.mall.pojo.UsersCoupon;
@Repository
public class CouponDaoImpl implements CouponDao {
	@Autowired
	private CouponMapper couponMapper;
	@Override
	public List<Coupon> referAllInfo(String kind) {
		return couponMapper.selectAllInfo(kind);
	}
	@Override
	public Coupon referCoupon(Integer couponId) {
		return couponMapper.selectUserGetCoupon(couponId);
	}
	@Override
	public List<UserCoupon> referUserCoupon(Integer userId) {
		return couponMapper.selectUserCoupon(userId);
	}
	@Override
	public Integer updateUserCoupons(Integer userId, Integer couponId, String couponUseTime) {
		return couponMapper.updateUserCoupons(userId,couponId,couponUseTime);
	}
	@Override
	public List<UsersCoupon> referUsersCoupon(Integer userId) {
		return couponMapper.selectUsersCoupon(userId);
	}
	@Override
	public Integer updateCouponNum(Integer couponId) {
		return couponMapper.updateCouponNum(couponId);
	}
	
	
}

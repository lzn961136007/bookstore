package com.bs.mall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.mall.pojo.Coupon;
import com.bs.mall.pojo.UserCoupon;
import com.bs.mall.pojo.UsersCoupon;

public interface CouponMapper {
	//查询优惠券种类
	List<Coupon> selectAllInfo(String kind);
	//用户领券的限制查询
	Coupon selectUserGetCoupon(Integer couponId);
	//查询用户拥有的优惠券
	List<UserCoupon> selectUserCoupon(@Param("userId")Integer userId);
	//修改用户优惠券使用状态
	Integer updateUserCoupons(@Param("userId")Integer userId, @Param("couponId")Integer couponId,@Param("couponUseTime") String couponUseTime);
	//查询用户领取的券
	List<UsersCoupon> selectUsersCoupon(Integer userId);
	//修改优惠券库存
	Integer updateCouponNum(Integer couponId);
}

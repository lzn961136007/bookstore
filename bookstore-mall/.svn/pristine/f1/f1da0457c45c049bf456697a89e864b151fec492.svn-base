package com.bs.mall.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bs.mall.pojo.Coupon;
import com.bs.mall.pojo.EditorCoupon;
import com.bs.mall.pojo.UserCoupon;
import com.bs.mall.pojo.UsersCoupon;
import com.bs.mall.service.CouponService;

@RestController
public class CouponController {
	@Autowired
	private CouponService couponService;
	@GetMapping("findcoupon/{kind}")
	public List<Coupon> findAllInfo(@PathVariable("kind") String kind){
		return couponService.getAllInfo(kind);
	}
	/**
	 * 获得用户所有优惠券
	 * @param userId
	 * @return
	 */
	@GetMapping("getUserCoupon/{userId}")
	public @ResponseBody List<UserCoupon> getUserCoupon(@PathVariable("userId") Integer userId){
		return couponService.getUserCoupon(userId);
	}
	/**
	 * 用户使用优惠券后改变数据库优惠券的状态
	 * @param userId
	 * @param couponId
	 * @param couponUseTime
	 * @return
	 */
	@RequestMapping(value="updateUserCoupons")
	public @ResponseBody boolean updateUserCoupons(HttpServletRequest request,HttpServletResponse response,@RequestBody  EditorCoupon coupon){
		System.out.println("coupon："+coupon);
		return couponService.updateUserCoupons(coupon.getUserId(),coupon.getCouponId(),coupon.getCouponUseTime());
	}
	
	@GetMapping("getUsersCoupon/{userId}")
	public @ResponseBody List<UsersCoupon> getUsersCoupon(@PathVariable("userId") Integer userId){
		return couponService.getUsersCoupon(userId);
	}
}

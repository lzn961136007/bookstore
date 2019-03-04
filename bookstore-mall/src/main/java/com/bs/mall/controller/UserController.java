package com.bs.mall.controller;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bs.mall.pojo.User;
import com.bs.mall.service.UserService;
import com.bs.mall.util.AppMD5Util;
import com.bs.mall.util.JsonData;
import com.bs.mall.util.SendEmail;
import com.bs.mall.util.SendEmail1;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	//登陆操作AppMD5Util.convertMD5(password))
	//@PathVariable是用获取请求URL中特定的 URI 获取URL请求路径上的变量值
	@GetMapping("{account}/{password}/findUser")
	public User findUSer(@PathVariable("account")String account,@PathVariable("password")String password){
		User user = userService.getSelectByUser(account,AppMD5Util.convertMD5(password));
		if(user!=null&&user.getEmail().equals(account)&&AppMD5Util.convertMD5(user.getPassword()).equals(password)){
			return user;
		}
		return null;
	}
	
	
	//判断邮箱是否被注册
	@GetMapping("{email}/searchEmail")
	public JsonData searchPhone(@PathVariable("email")String email) throws Exception{
		User user = userService.getUserByEmail(email);
		System.out.println("获取的User为："+user);
		if(user==null){
			return new JsonData(null, null, "邮箱未注册", false);
		}
			return new JsonData(null, null, "邮箱已注册", true);
	
	
	}
	//判断用户名是否被注册
	@GetMapping("{username}/searchName")
	public JsonData searchName(@PathVariable("username")String username){
		User user = userService.getUserByName(username);
		if(user == null){
			return new JsonData(null, null, "用户名未注册", false);
		}else{
			return new JsonData(null, null, "用户名已注册", true);
		}
	}
	//注册数据增添到数据库
	@GetMapping("{email}/{username}/{password}/searchUser")
	public JsonData searchUser(@PathVariable("email")String email,@PathVariable("username")String username,@PathVariable("password")String password){
		Boolean status = userService.addUser(email, username, AppMD5Util.convertMD5(password));
		if(status==true){
			try {
				SendEmail.send(email);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return new JsonData(null, null, "注册成功", true);
		}else{
		return new JsonData(null, null, "注册失败", false);
		}
	}
	
	//注册成功后修改用户的状态
	@GetMapping("{email}/{active}/updateStatus")
	public ModelAndView updateStatus(@PathVariable("email")String email,@PathVariable("active")String active){
		try {
			User user = userService.getUserByEmail(email);
			System.out.println("User:"+user);
			user.setActive("1");
			userService.getUpdateByStatus(user);
			ModelAndView mv=new ModelAndView();
			mv.setViewName("/index");
			mv.addObject("message","恭喜您用户激活成功,请去登陆页面登陆");
			return mv;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
		 
	}
	
	
	//查询邮箱是否注册
	@GetMapping("{email}/updatePhone")
	public JsonData updatePhone(@PathVariable("email")String email){
		User user = userService.getUserByPhone(email);
		if(user != null){
			try {
				SendEmail1.send(email);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return new JsonData(null, null, "存在邮箱", true);
		}else{
			return new JsonData(null, null, "邮箱尚未注册", false);
		}
		
	}
	//获取验证码
	@GetMapping("{email}/authCode")
	public ModelAndView authCode(@PathVariable("email")String email){
		int num = new Random().nextInt(1000001);
		if(num!=0){
			ModelAndView mv = new ModelAndView();
			mv.setViewName("/index");
			mv.addObject("code", "您获取的验证码为："+num);
			return mv;
		}else{
			return null;
		}
	}
	
//	@GetMapping("{code}/authNum")
//	public Boolean authNum(@PathVariable("code")Integer code){
//		System.out.println("code:"+code+"---num:"+num);
//		if(num==code){
//			return true;
//		}else{
//			return false;
//		}
//	}
	
	//修改密码
	@GetMapping("{email}/{newPassword}/updateUser")
	public JsonData updateUser(@PathVariable("email")String email,@PathVariable("newPassword")String newPassword){
		Boolean status = userService.getUpdateByUser(email,AppMD5Util.convertMD5(newPassword));
		if(status==true){
			
			return new JsonData(null, null, "修改成功", true);
		}else{
			return new JsonData(null, null, "修改失败", false);
		}
		
	}
	
	//用户领券
	@GetMapping("newUserGetCoupon/{userId}/{couponId}")
	public JsonData userGetCoupon(@PathVariable("userId") Integer userId,@PathVariable("couponId") Integer couponId){
		try {
			
			Boolean boo1 = userService.getNewUser(userId);
			if(boo1){
				return new JsonData(null, null, "您不是新用户！", boo1);
			}
			Boolean boo2 = userService.getGetCoupon(userId, couponId);
			if(boo2){
				return new JsonData(null, null, "您已经领取过了！", boo2);
			}
			Boolean getCoupon = userService.addUserGetCoupon(userId, couponId); 
			
			if(getCoupon){
				return new JsonData(null, null, "领取成功！", getCoupon);
			}else{
				return new JsonData(null, null, "领取失败！", getCoupon);
			}
		} catch (Exception e) {
			return new JsonData(null, null, "没有注册", false);
		}
	}
	@GetMapping("getCoupon/{userId}/{couponId}")
	public JsonData getCoupon(@PathVariable("userId") Integer userId,@PathVariable("couponId") Integer couponId){
		Boolean boolean1 = userService.getGetCoupon(userId, couponId);
		if(boolean1){
			return new JsonData(null, null, "您已经领取过了！", boolean1);
		}else{
			return userService.addCouponInfo(userId, couponId);
		}
	}

	/**
	 * 用户修改个人信息
	 * @param request
	 * @param response
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/editorUserInfomation")
	public @ResponseBody boolean editorUserInfomation(HttpServletRequest request,HttpServletResponse response,@RequestBody  User user) {
			System.out.println(user);
		return userService.editorUserInfomation(user);	
	}
	/**
	 * 用户手机重复的验证
	 * @param userId
	 * @param couponId
	 * @return
	 */
	@GetMapping("phoneValidate/{phone}")
	public boolean phoneValidate(@PathVariable("phone") String phone){
		return userService.phoneValidate(phone);
	}

}

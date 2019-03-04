package com.bs.mall.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bs.mall.pojo.Cart;
import com.bs.mall.service.CartService;

@Controller
public class CartController {
	@Autowired
	private CartService cs;
	
	/**
	 * 查询用户购物车所有商品
	 * @param userId
	 * @return
	 */
	@GetMapping("/selectCart/{userId}")
	public @ResponseBody List<Cart> selectUserCart(@PathVariable("userId") Integer userId) {
	
		return cs.getCartByUserId(userId);
	}
	
	@GetMapping("/insertCartUserId/{userId}")
	public @ResponseBody boolean insertCartUserId(@PathVariable("userId") Integer userId) {
	
	
		return cs.insertCartUserId(userId);
	}
	
	@RequestMapping(value="/insertCart")
	public @ResponseBody boolean insertCart(HttpServletRequest request,HttpServletResponse response,@RequestBody  List<Cart> Carts) {
	
		for (Cart cart : Carts) {
			System.out.println(cart);
		}
		return cs.insertCart(Carts);	
	}
}

package com.bs.mall.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.mall.dao.CartDao;
import com.bs.mall.pojo.Cart;
import com.bs.mall.service.CartService;
@Service
public class CartServiceImpl implements CartService {
	@Autowired
	private CartDao cd;
	
	private Integer userId;
	
	@Override
	public List<Cart> getCartByUserId(Integer userId) {
		System.out.println("=================================="+userId);
		
		List<Cart> carts = cd.referCartByUserId(userId);
		if(carts.size()>0){
			System.out.println("==================getCartByUserId================"+userId+"====carts=="+carts);
			if(cd.delCart(userId)!=0){		
				return carts;
				
			}//清空用户数据库中的数据	
		}
		return null;
	}
	@Override
	public boolean insertCart(List<Cart> Carts) {
		List<Cart> cartss = new ArrayList<Cart>();
		
		//添加用户id
		for (Cart cart : Carts) {
			cart.setUserId(this.userId);
			cartss.add(cart);
		}
		
		if(cd.addCart(cartss)!=0)
			{return true;}
		return false;
		
	}
	@Override
	public boolean insertCartUserId(Integer userId) {
		this.userId=userId;
		return true;
	}

}

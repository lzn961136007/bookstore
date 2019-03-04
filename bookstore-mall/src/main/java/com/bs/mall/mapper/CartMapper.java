package com.bs.mall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.mall.pojo.Cart;

public interface CartMapper {
	List<Cart> selectCartByUserId(Integer userId);
	//
	Integer addCart(@Param("Carts")List<Cart>Carts);
	
	//清空用户的数据库
	Integer delCart(@Param("userId") Integer userId);	
}

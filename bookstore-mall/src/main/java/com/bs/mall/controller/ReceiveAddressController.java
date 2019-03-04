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

import com.bs.mall.pojo.ReceiveAddress;
import com.bs.mall.service.ReceiveAddressService;

@Controller
public class ReceiveAddressController {
	@Autowired
	private ReceiveAddressService rs;
	
	/**
	 * 查询用户所有的收货地址
	 * @param userId
	 * @return
	 */
	@GetMapping("/selectReceiveAddress/{userId}")
	public @ResponseBody List<ReceiveAddress> selectReceiveAddress(@PathVariable("userId") Integer userId) {
		return rs.getReceiveAddressByUserId(userId);
	}
	/**
	 * 查询用户默认收货地址
	 * @param userId
	 * @return
	 */
	@GetMapping("/selectDefaultReceiveAddress/{userId}")
	public @ResponseBody ReceiveAddress selectDefaultReceiveAddress(@PathVariable("userId") Integer userId) {
		return rs.getDefaultReceiveAddress(userId);
	}
	
	/**
	 * 删除用户收货地址
	 * @param userId
	 * @param addressId
	 * @return
	 */
	@GetMapping("/delReceiveAddress/{userId}/{addressId}")
	public @ResponseBody boolean delUserReceiveAddress(@PathVariable("userId") Integer userId,@PathVariable("addressId")Integer addressId) {
		return rs.delUserReceiveAddress(userId,addressId);
	}
	/**
	 * 添加收货地址
	 * @param request
	 * @param response
	 * @param receiveAddress
	 * @return
	 */
	@RequestMapping(value="/addReceiveAddress")
	public @ResponseBody boolean addRceiveAddress(HttpServletRequest request,HttpServletResponse response,@RequestBody  ReceiveAddress receiveAddress) {
		System.out.println(receiveAddress);			
		return rs.addRceiveAddress(receiveAddress);	
	}
	/**
	 * 修改收货地址的方法
	 * @param request
	 * @param response
	 * @param editorAddress
	 * @return
	 */
	@RequestMapping(value="/editorReceiveAddress")
	public @ResponseBody boolean editorReceiveAddress(HttpServletRequest request,HttpServletResponse response,@RequestBody  ReceiveAddress editorAddress) {
			System.out.println(editorAddress);
		return rs.editorReceiveAddress(editorAddress);	
	}
	/**
	 * 修改默认收货地址
	 * @param userId
	 * @param addressId
	 * @return
	 */
	@GetMapping("/updateUserReceiveAddressStatus/{userId}/{newAddressId}/{oldAddressId}")
	public @ResponseBody boolean updateUserReceiveAddressStatus(@PathVariable("userId") Integer userId,@PathVariable("newAddressId")Integer newAddressId,@PathVariable("oldAddressId")Integer oldAddressId) {
		return rs.updateUserReceiveAddressStatus(userId,newAddressId,oldAddressId);
	}

}

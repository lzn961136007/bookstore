package com.bs.mall.dao;

import java.util.List;

import com.bs.mall.pojo.ReceiveAddress;

public interface ReceiveAddressDao {

	List<ReceiveAddress> referReceiveAddressByUserId(Integer userId);

	Integer insetReceiveAddress(ReceiveAddress receiveAddress);

	Integer delUserReceiveAddress(Integer userId, Integer addressId);

	Integer editorUserReceiveAddress(ReceiveAddress editorAddress);

	Integer updateUserReceiveAddressStatus(Integer userId, Integer addressId, boolean addressStatus);

	ReceiveAddress referDefaultReceiveAddress(Integer userId);
	

}

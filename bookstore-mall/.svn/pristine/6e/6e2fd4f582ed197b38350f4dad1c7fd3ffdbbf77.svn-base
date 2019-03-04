package com.bs.mall.service;

import java.util.List;
import com.bs.mall.pojo.ReceiveAddress;

public interface ReceiveAddressService {
	List<ReceiveAddress> getReceiveAddressByUserId(Integer userId);
	boolean addRceiveAddress(ReceiveAddress receiveAddress);
	boolean delUserReceiveAddress(Integer userId, Integer addressId);
	boolean editorReceiveAddress(ReceiveAddress editorAddress);
	boolean updateUserReceiveAddressStatus(Integer userId, Integer newAddressId, Integer oldAddressId);
	ReceiveAddress getDefaultReceiveAddress(Integer userId);
	
}

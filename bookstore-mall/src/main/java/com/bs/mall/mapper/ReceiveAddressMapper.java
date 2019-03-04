package com.bs.mall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.mall.pojo.ReceiveAddress;

public interface ReceiveAddressMapper {
	List<ReceiveAddress> selectReceiveAddressByUserId(Integer userId);

	Integer insetReceiveAddress(@Param("receiveAddress") ReceiveAddress receiveAddress);

	Integer delUserReceiveAddress(@Param("userId") Integer userId,@Param("addressId") Integer addressId);

	Integer updateUserReceiveAddress(@Param("editorAddress") ReceiveAddress editorAddress);

	Integer updateUserReceiveAddressStatus(@Param("userId") Integer userId,@Param("addressId") Integer addressId,@Param("addressStatus")boolean addressStatus);

	ReceiveAddress selectDefaultReceiveAddress(@Param("userId") Integer userId);


	
}

package com.bs.mall.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bs.mall.dao.ReceiveAddressDao;
import com.bs.mall.mapper.ReceiveAddressMapper;
import com.bs.mall.pojo.ReceiveAddress;
@Repository
public class ReceiveAddressDaoImpl implements ReceiveAddressDao {
	@Autowired
	private ReceiveAddressMapper rm;
	@Override
	public List<ReceiveAddress> referReceiveAddressByUserId(Integer userId) {
		return rm.selectReceiveAddressByUserId(userId);
	}
	@Override
	public Integer insetReceiveAddress(ReceiveAddress receiveAddress) {
		return rm.insetReceiveAddress(receiveAddress);
	}
	@Override
	public Integer delUserReceiveAddress(Integer userId, Integer addressId) {
		return rm.delUserReceiveAddress(userId,addressId);
	}
	@Override
	public Integer editorUserReceiveAddress(ReceiveAddress editorAddress) {
		return rm.updateUserReceiveAddress(editorAddress);
	}
	@Override
	public Integer updateUserReceiveAddressStatus(Integer userId, Integer addressId,boolean addressStatus) {
		return rm.updateUserReceiveAddressStatus(userId,addressId,addressStatus);
	}
	@Override
	public ReceiveAddress referDefaultReceiveAddress(Integer userId) {
		return rm.selectDefaultReceiveAddress(userId);
	}
	
	
//	@Override
//	public List<Book> referBookByKeyword(Integer pageNum, String keyword) {
//		Integer index = (pageNum-1)*10;
//		return bm.selectBookByKeyword(index, keyword);
//	}
//	@Override
//	public List<Book> referFavoriteBook(Integer userId) {
//		return bm.selectFavoriteBook(userId);
//	}
//	@Override
//	public List<HotBook> referHotBookByPage(Integer pageNum) {
//		Integer index = (pageNum-1)*10;
//		return bm.selectHotBookByPage(index);
//	}

}

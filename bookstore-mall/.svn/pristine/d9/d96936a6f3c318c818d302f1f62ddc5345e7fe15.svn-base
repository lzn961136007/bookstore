package com.bs.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.mall.dao.ReceiveAddressDao;
import com.bs.mall.pojo.ReceiveAddress;
import com.bs.mall.service.ReceiveAddressService;
@Service
public class ReceiveAddressServiceImpl implements ReceiveAddressService {
	@Autowired
	private ReceiveAddressDao ad;

	@Override
	public List<ReceiveAddress> getReceiveAddressByUserId(Integer userId) {
		return ad.referReceiveAddressByUserId(userId);
	}

	@Override
	public boolean addRceiveAddress(ReceiveAddress receiveAddress) {
		if(ad.insetReceiveAddress(receiveAddress)!=0){
			return true;
		}
		return false;
	}

	@Override
	public boolean delUserReceiveAddress(Integer userId, Integer addressId) {
		if(ad.delUserReceiveAddress(userId,addressId)!=0){
			return true;
		}
		return false;
	}

	@Override
	public boolean editorReceiveAddress(ReceiveAddress editorAddress) {
		if(ad.editorUserReceiveAddress(editorAddress)!=0){
			return true;
		}
		return false;
	}

	@Override
	public boolean updateUserReceiveAddressStatus(Integer userId, Integer newAddressId, Integer oldAddressId) {
	boolean a=false;
	boolean b=false;
	//修改新地址为默认地址
	
		if(ad.updateUserReceiveAddressStatus(userId,newAddressId,true)!=0){
			a=true;
		}
	//修改原默认地址为非默认地址
		
		if(ad.updateUserReceiveAddressStatus(userId,oldAddressId,false)!=0){
			b=true;
		}
	//若两个都修改成功就返回ture否则返回false
		
		if(a&&b){
			return true;
		}
		return false;
	}

	@Override
	public ReceiveAddress getDefaultReceiveAddress(Integer userId) {
		return ad.referDefaultReceiveAddress(userId);
	}
	
	
//	@Override
//	public List<Book> getBookByKeyword(Integer pageNum, String keyword) {
//		return bd.referBookByKeyword(pageNum, keyword);
//	}
//	@Override
//	public List<Book> getFavoriteBook(Integer userId) {
//		return bd.referFavoriteBook(userId);
//	}
//	@Override
//	public List<HotBook> getHotBookByPage(Integer pageNum) {
//		return bd.referHotBookByPage(pageNum);
//	}
	

}

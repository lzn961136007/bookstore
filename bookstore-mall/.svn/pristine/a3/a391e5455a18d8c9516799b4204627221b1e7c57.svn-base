package com.bs.mall.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bs.mall.dao.MemberDao;
import com.bs.mall.pojo.Member;
import com.bs.mall.pojo.MemberRecord;
import com.bs.mall.service.MemberService;
@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao md;
	@Override
	public List<Member> getAllMember() {
		return md.referAllMember();
	}
	@Override
	public List<MemberRecord> getAllRecordByUserId(Integer userId) {
		return md.referAllRecordByUserId(userId);
	}
	@Transactional(rollbackFor={RuntimeException.class, Exception.class})
	@Override
	public Boolean addMemberUser(Integer userId, Integer memberId) {
		Integer userMember = md.createUserMember(userId, memberId);
		return userMember>0?true:false;
	}

}

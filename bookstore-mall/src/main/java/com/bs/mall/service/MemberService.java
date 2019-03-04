package com.bs.mall.service;

import java.util.List;

import com.bs.mall.pojo.Member;
import com.bs.mall.pojo.MemberRecord;

public interface MemberService {
	List<Member> getAllMember();
	List<MemberRecord> getAllRecordByUserId(Integer userId);
	Boolean addMemberUser(Integer userId,Integer memberId);
}

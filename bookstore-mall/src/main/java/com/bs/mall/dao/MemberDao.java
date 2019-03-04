package com.bs.mall.dao;

import java.util.List;

import com.bs.mall.pojo.Member;
import com.bs.mall.pojo.MemberRecord;

public interface MemberDao {
	List<Member> referAllMember();
	List<MemberRecord> referAllRecordByUserId(Integer userId);
	Integer createUserMember(Integer userId,Integer memberId);
}

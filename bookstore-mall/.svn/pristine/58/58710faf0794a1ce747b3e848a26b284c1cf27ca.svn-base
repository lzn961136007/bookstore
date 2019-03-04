package com.bs.mall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.mall.pojo.Member;
import com.bs.mall.pojo.MemberRecord;

public interface MemberMapper {
	List<Member> selectAllMember();
	List<MemberRecord> selectAllRecordByUserId(Integer userId);
	Integer insertMemberUser(@Param("userId")Integer userId,@Param("memberId")Integer memberId,@Param("createTime")String createTime);
}

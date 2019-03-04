package com.bs.mall.mapper;

import org.apache.ibatis.annotations.Param;

public interface UserToBookMapper {
	Integer cancelUserFavorite(@Param("userId") Integer userId,@Param("bookId") Integer bookId);
}

package com.bs.mall.mapper;

import org.apache.ibatis.annotations.Param;

public interface UtilMapper {
	//查询字段是否在表中
	Integer judgeColumnExist(@Param("tableName")String tableName,@Param("column1")String column1,
			@Param("column2")String column2,@Param("column1Value")String column1Value,@Param("column2Value")String column2Value);
}

package com.bs.mall.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bs.mall.mapper.UtilMapper;
import com.bs.mall.pojo.User;

@Component
public class JudgeUser {
	@Autowired
	private UtilMapper um;
	/**
	 * @param user
	 * @return 判断是否是新用户
	 */
	public Boolean judgeUser(User user){
		Date datenow = new Date();
		Date date = new Date();
		Date registerDate = user.getRegisterDate();
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DATE);
		String time = year+"-"+month+"-"+day;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse(new SimpleDateFormat("yyyy-MM-dd").format(registerDate));
			datenow = new SimpleDateFormat("yyyy-MM-dd").parse(time);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date.before(datenow);
	}
	/**
	 * 
	 * @param tableName 表名
	 * @param columns  字段名 可以为多个
	 * @return boolean
	 */
	public Boolean judgeColumnExites(String tableName,String column1,String column2,String column1Value,String column2Value){
		Integer judge = um.judgeColumnExist(tableName, column1, column2, column1Value, column2Value);
		return judge>0?true:false;
	}
}

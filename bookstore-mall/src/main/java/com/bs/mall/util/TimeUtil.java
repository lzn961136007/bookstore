package com.bs.mall.util;

import java.text.SimpleDateFormat;
import java.util.Date;
//创建的时间类
public class TimeUtil {
	
	public static String getCurrentDate(){
		return new SimpleDateFormat("YYYY-MM-dd").format(new Date());
	}
	public static String getCurrentTime(String format){
		return new SimpleDateFormat(format).format(new Date());
	}
//	public static void main(String[] args) {
//		System.out.println(DateFormat.getDateTimeInstance().format(new Date()));
//	}
}

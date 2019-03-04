package com.bs.mall.util;

import java.util.UUID;

public class CreateOrderId {
	//使用UUID生成16位订单号的方法
		public static String getOrderIdByUUId(){
			int machineId=1;
			int hashCodeV=UUID.randomUUID().toString().hashCode();
			if(hashCodeV<0){
				hashCodeV=-hashCodeV;
			}
			return machineId+ String.format("%015d", hashCodeV);
		}
		
}

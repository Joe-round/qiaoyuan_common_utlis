package com.qiaoyuan.common.utlis;

import java.util.Calendar;
import java.util.Date;

public class DateUtli {
	
	public static Date getDate(Date startDate) {
		//获取当前时间
		Calendar c = Calendar.getInstance();
		//转换为毫秒数
		long endTime = c.getTimeInMillis();
		//获取开始时间
		c.setTime(startDate);
		//获取开始时间毫秒数
		long startMillis = c.getTimeInMillis();
		//随机生成时间毫秒数
		long x = (long) (Math.random()*(endTime - startMillis))+startMillis;
		//时间毫秒数装换为Date类型
		c.setTimeInMillis(x);
		return c.getTime();
		
		
	}
	
}

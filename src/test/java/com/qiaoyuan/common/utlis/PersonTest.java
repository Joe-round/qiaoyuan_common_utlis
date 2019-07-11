package com.qiaoyuan.common.utlis;

import java.util.Calendar;

import org.junit.Test;

import com.qiaoyuan.common.entity.Person;

public class PersonTest {

	@Test
	public void testPerson() {
		//实例化日历实体类
		Calendar c = Calendar.getInstance();
		//给实体类赋值
		c.set(2010, 0, 1);
		for (int i = 0; i < 10000; i++) {
			Person p = new Person(StringUtil.generateChineseName(), RandomUtli.random(1, 120),
					StringUtil.randomChineseString(140), c.getTime());
			System.out.println(p);
		}
	}
}

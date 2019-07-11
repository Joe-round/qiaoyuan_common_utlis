package com.qiaoyuan.common.utlis;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean falg = StringUtil.hasLength("  ");
		if(falg) {
			System.out.println("没有值");
		}else {
			System.out.println("有值");
		}
	}

	@Test
	public void testHasText() {
		boolean falg = StringUtil.hasText("   ");
		if(falg) {
			System.out.println("没有值");
		}else {
			System.out.println("有值");
		}
	}
	@Test
	public void randomChineseStringTest() {
		String randomString = StringUtil.randomChineseString(100);
		System.out.println(randomString);
	}
	@Test
	public void generateChineseNameTest() {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}

}

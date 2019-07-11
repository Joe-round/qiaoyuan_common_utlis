package com.qiaoyuan.common.utlis;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtliTest {
	
	@Test
	public void testRandom() {
		for (int i = 0; i < 5; i++) {
			System.out.println(RandomUtli.random(1, 10));
		}
	}
	@Test
	public void subRandom() {
		int[] arr = RandomUtli.subRandom(1, 10, 6);
		for (int i : arr) {
			System.out.println(i);
		}
	}
	@Test
	public void randomCharacter() {
		for (int i = 0; i < 5; i++) {
			System.out.println(RandomUtli.randomCharacter());
		}
	}
	@Test
	public void randomString() {
		for (int i = 0; i < 5; i++) {
			System.out.println(RandomUtli.randomString(4));
		}
	}

}

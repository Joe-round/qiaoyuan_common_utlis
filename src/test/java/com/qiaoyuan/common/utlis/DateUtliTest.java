package com.qiaoyuan.common.utlis;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtliTest {

	@Test
	public void testGetDate() {
		Calendar c = Calendar.getInstance();
		c.set(2010, 0, 1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i < 1000; i++) {
			Date date = DateUtli.getDate(c.getTime());
			System.out.println(sdf.format(date));
		}
	}

}

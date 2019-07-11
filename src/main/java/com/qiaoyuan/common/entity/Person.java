package com.qiaoyuan.common.entity;

import java.util.Date;
/**
 * 
 * @ClassName: Person 
 * @Description: 实体类
 * @author:qy
 * @date: 2019年7月11日 下午8:03:01
 */
public class Person {

	private String name;//姓名
	private int age;//年龄
	private String about;//介绍
	private Date date;//注册日期
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Person() {
		super();
	}
	public Person(String name, int age, String about, Date date) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", about=" + about + ", date=" + date + "]";
	}
	
	
	
}

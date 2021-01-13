package com.tds.spring.di;

public class Student {
	
	String stuName;
	int age;
	Integer studentId;
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Integer getSutdentId() {
		return studentId;
	}
	public void setSutdentId(Integer sutdentId) {
		this.studentId = sutdentId;
	}
	
	@Override
	public String toString() {
		return "Student [stuName=" + stuName + ", age=" + age + ", sutdentId=" + studentId + "]";
	}
	
}

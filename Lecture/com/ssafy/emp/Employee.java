package com.ssafy.emp;

import java.io.Serializable;

public class Employee implements Serializable{
	private String sabun;
	private String name;
	private int age;
	private String dept;

	public Employee(String sabun, String name, int age, String dept) {
		super();
		this.sabun = sabun;
		this.name = name;
		this.age = age;
		this.dept = dept;
	}

	public String getSabun() {
		return sabun;
	}

	public void setSabun(String sabun) {
		this.sabun = sabun;
	}

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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [sabun=" + sabun + ", name=" + name + ", age=" + age + ", dept=" + dept + "]";
	}

}

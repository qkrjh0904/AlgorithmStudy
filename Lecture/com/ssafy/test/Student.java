package com.ssafy.test;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	private int jumsu;
	public Student() {}
	public Student(String name, int age, int jumsu) {
		super();
		this.name = name;
		this.age = age;
		this.jumsu = jumsu;
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
	public int getJumsu() {
		return jumsu;
	}
	public void setJumsu(int jumsu) {
		this.jumsu = jumsu;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", jumsu=" + jumsu + "]";
	}
	@Override
	public int compareTo(Student o) {
		
		return name.compareTo(o.getName());
	}
	
	
}

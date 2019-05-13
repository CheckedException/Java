package com.m2q.day01demo2;

public class dog {
	int age;
	String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
//		this.age = age;
		System.out.println(this);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public dog(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public dog() {
		
		
	}
}

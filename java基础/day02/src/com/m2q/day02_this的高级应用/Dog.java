package com.m2q.day02_this的高级应用;

public class Dog {
	String name ;
	int age;
	public Dog(String name) {
		//super();
		this("金毛",18);
		//this.name = name;
	}
	public Dog(int age) {
		super();
		this.age = age;
	}
	public Dog(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	public Dog() {
		//super();
		this("金毛",18);
		// TODO Auto-generated constructor stub
	}
	
	
}

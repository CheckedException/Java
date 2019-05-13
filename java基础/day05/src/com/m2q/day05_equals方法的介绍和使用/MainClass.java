package com.m2q.day05_equals方法的介绍和使用;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dd1 =new Dog();
		Dog dd2 = new Dog();
		Person p = new Person();
		p.age = 1;
		dd1.age = 1;
		dd2.age = 1;
		boolean b = dd1.equals(p);
		System.out.println(b);
	}

}

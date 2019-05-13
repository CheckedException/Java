package com.m2q.day02_抽象类的介绍;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelpTeacher hp = new HelpTeacher();
		hp.name = "张三";
		hp.id = 123;
		hp.age = 23;
		hp.setAge(12);
		int age = hp.getAge();
		System.out.println("助教的名字是："+ hp.name + "id是：" + hp.id + "年龄是:" + age +"他的工作是:");
		hp.work();
	}

}

package com.m2q.day03_向上转型向下转型Instanceof;

public class Dog extends Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("吃骨头，汪汪汪");
	}
	
	public void lookHome(){
		System.out.println("看家");
	}

}

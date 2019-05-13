package com.m2q.day03_代理设计模式完善;

public class Boy {
	String name ;
	nvyouInterface nvyou;
	public void hungery(){
		System.out.println("我饿了");
		nvyou.cook();
	}
	public void thirsty(){
		System.out.println("我渴了");
		nvyou.daoshui();
	}
	public void tired(){
		System.out.println("我累了");
		nvyou.anmo();
	}
}

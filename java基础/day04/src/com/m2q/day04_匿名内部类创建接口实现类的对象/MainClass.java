package com.m2q.day04_匿名内部类创建接口实现类的对象;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Animal() {
			
			@Override
			public void lookHome() {
				// TODO Auto-generated method stub
				System.out.println("lookhome");
			}
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("eat");
			}
		}.eat();
		
		Animal an = new Animal() {
			
			@Override
			public void lookHome() {
				// TODO Auto-generated method stub
				System.out.println("lookhome1");
			}
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("eat1");
			}
		};
		an.eat();
		an.lookHome();
		
		new NvyouInterface() {
			
			@Override
			public void moMO() {
				// TODO Auto-generated method stub
				System.out.println("momo");
			}
			
			@Override
			public void cook() {
				// TODO Auto-generated method stub
				
			}
		}.moMO();
		
		NvyouInterface nv =  new NvyouInterface() {
			
			@Override
			public void moMO() {
				// TODO Auto-generated method stub
				System.out.println("momo1");
			}
			
			@Override
			public void cook() {
				// TODO Auto-generated method stub
				System.out.println("cook1");
			}
		};
		nv.cook();
		nv.moMO();
	}

}

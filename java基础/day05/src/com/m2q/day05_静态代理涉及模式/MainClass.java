package com.m2q.day05_静态代理涉及模式;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ComputerCompany cc = new ComputerCompany();
		MiniComputer mini = new MiniComputer();
		ProxyPerson pp = new ProxyPerson(mini);
		System.out.println(pp.buyComputer()); ;
		pp.repair();
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		boolean a = d1.equals(d2) ;
		System.out.println(a);
	}

}

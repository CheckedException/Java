package com.m2q.day05_静态代理涉及模式;

public class ProxyPerson implements ComputerInterface {
	private ComputerInterface computer;
	@Override
	public String buyComputer() {
		// TODO Auto-generated method stub
		return "鼠标，键盘，U盘 ,5000$" + computer.buyComputer();
	}

	@Override
	public void repair() {
		// TODO Auto-generated method stub
		System.out.println("运费1000");
		computer.repair();
		System.out.println("报关费1000");

	}

	public ProxyPerson(ComputerInterface computer) {
		this.computer = computer;
	}

	
}

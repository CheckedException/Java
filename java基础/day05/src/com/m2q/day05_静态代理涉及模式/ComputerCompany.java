package com.m2q.day05_静态代理涉及模式;

public class ComputerCompany implements ComputerInterface {

	@Override
	public String buyComputer() {
		// TODO Auto-generated method stub
		return "Y4500 ";
	}

	@Override
	public void repair() {
		// TODO Auto-generated method stub
		System.out.println("免费维修好了");
	}

}

package com.m2q.day05_静态代理涉及模式;

public class MiniComputer implements ComputerInterface{

	@Override
	public String buyComputer() {
		// TODO Auto-generated method stub
		return "MINI Computer";
	}

	@Override
	public void repair() {
		// TODO Auto-generated method stub
		System.out.println("运费5块");
	}

}

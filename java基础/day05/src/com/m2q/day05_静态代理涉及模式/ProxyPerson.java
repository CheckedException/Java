package com.m2q.day05_��̬�����漰ģʽ;

public class ProxyPerson implements ComputerInterface {
	private ComputerInterface computer;
	@Override
	public String buyComputer() {
		// TODO Auto-generated method stub
		return "��꣬���̣�U�� ,5000$" + computer.buyComputer();
	}

	@Override
	public void repair() {
		// TODO Auto-generated method stub
		System.out.println("�˷�1000");
		computer.repair();
		System.out.println("���ط�1000");

	}

	public ProxyPerson(ComputerInterface computer) {
		this.computer = computer;
	}

	
}

package com.m2q.day02_������Ľ���;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelpTeacher hp = new HelpTeacher();
		hp.name = "����";
		hp.id = 123;
		hp.age = 23;
		hp.setAge(12);
		int age = hp.getAge();
		System.out.println("���̵������ǣ�"+ hp.name + "id�ǣ�" + hp.id + "������:" + age +"���Ĺ�����:");
		hp.work();
	}

}

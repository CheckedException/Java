package com.m2q.day02_������ع�;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		Dog d = new Dog();
		d.name = "����";
		person.name = "����";
		KillPerson(person);
		KillDog(d);

	}
	
	public static void KillPerson(Person person){
		System.out.println("kill it:" + person.name);
	}
	public static void KillDog(Dog dog){
		System.out.println("this is a dog,name is:" +dog.name);
	}

}

package com.m2q.day03_è������;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pig pp = new Pig();
		feedAnimal(pp);
		Dog d = new Dog();
		//feedDoy(d);
		feedAnimal(d);
		Tiger ti = new Tiger();
		feedAnimal(ti);
	}
	public static void feedAnimal(Animal an){//Animal an = new Pig()
		System.out.println("С�����Է���....");
		an.eat();
	}
//	public static void feedPig(Pig pig){
//		System.out.println("С�������Է���...");
//		pig.eat();
//	}
//	
//	public static void feedDoy(Dog dog){ //Dog dog = new Dog
//		System.out.println("С�������Է���...");
//		dog.eat();
//	}

}

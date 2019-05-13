package com.m2q.day03_Ã¨¹·°¸Àý;

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
		System.out.println("Ð¡±¦±´³Ô·¹À²....");
		an.eat();
	}
//	public static void feedPig(Pig pig){
//		System.out.println("Ð¡±¦±´¶ù³Ô·¹À²...");
//		pig.eat();
//	}
//	
//	public static void feedDoy(Dog dog){ //Dog dog = new Dog
//		System.out.println("Ð¡±¦±´¶ù³Ô·¹À²...");
//		dog.eat();
//	}

}

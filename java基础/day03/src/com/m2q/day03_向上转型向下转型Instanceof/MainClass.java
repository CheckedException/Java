package com.m2q.day03_向上转型向下转型Instanceof;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal an = new Cat();
//		Dog d = (Dog)an;
//		d.lookHome();
//		Animal an1 = new Cat();
//		an1.eat();
//		Cat c = (Cat)an1;
//		c.cashMouse();
		boolean b = an instanceof Dog;
		if(b){
			Dog d = (Dog)an;
			d.lookHome();
		}
		boolean c = an instanceof Cat;
		if(c){
			Cat cc = (Cat)an;
			cc.cashMouse();
		}
	}

}

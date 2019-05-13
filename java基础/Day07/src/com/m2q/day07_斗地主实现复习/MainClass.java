package com.m2q.day07_斗地主实现复习;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cards = new ArrayList<String>();
		String[] huase = {"♥","♣","♢","♠"};
		String[] ziti ={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for (int i = 0; i < ziti.length; i++) {
			for (int j = 0; j < huase.length; j++) {
				cards.add( huase[j]+ziti[i]);
				//System.out.println(4%3);
			}
		}
		//System.out.println(cards);
		//加入大小王
		cards.add("大S");
		cards.add("小S");
		//洗牌
		Collections.shuffle((List<String>) cards);
		//System.out.println(cards);
		//发牌
		//定义person1
		Collection<String> person1 = new ArrayList<String>();
		//定义Person2
		ArrayList<String> person2 = new ArrayList<String>();
		ArrayList<String> person3 = new ArrayList<String>();
		Collection<String> dp = new ArrayList<String>();
		for (int i = 0; i < cards.size(); i++) {
			String card = cards.get(i);
			if (i>50) {
				dp.add(card);
			}
			if (i%3 == 0) {
				person1.add(card);
			}
			if(i%3 ==1){
				person2.add(card);
			}
			if(i%3 ==2){
				person3.add(card);
			}
		}
		//看牌
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println(dp);
	}

}

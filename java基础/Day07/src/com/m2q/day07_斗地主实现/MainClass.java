package com.m2q.day07_斗地主实现;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> cards = new ArrayList<String>();
		String[] huase = {"♥","♠","♣","♦"};
		String[] daxiao = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for (String d : daxiao) {
			for (String h : huase) {
				String card = h+d;
				cards.add(card);
			}
		}
		cards.add("大S");
		cards.add("小S");
		//System.out.println(cards);
		Collections.shuffle((List<?>) cards);
		//System.out.println(cards);
		ArrayList<String> p1 = new ArrayList<String>();
		ArrayList<String> p2 = new ArrayList<String>();
		ArrayList<String> p3 = new ArrayList<String>();
		ArrayList<String> dp = new ArrayList<String>();
		for (int i = 0; i < cards.size(); i++) {
			String card = ((ArrayList<String>) cards).get(i);
			if (i>50) {
				dp.add(card);
			}
			if (i%3 ==0) {
				p1.add(card);
				}
			else if (i%3 ==1) {
				p2.add(card);
			}else{
				p3.add(card);
			}
		}
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(dp);
	}

}

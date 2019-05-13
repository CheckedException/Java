package com.m2q.day09_斗地主实现;

import java.nio.channels.ShutdownChannelGroupException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建牌
		Map<Integer, String> map = new HashMap<Integer, String>();
		ArrayList<String> cards = new ArrayList<String>();
		int key = 1;
		String[] color = {"♥","♣","♦","♠"};
		String[] nums = {"3","4","5","6","7","8","9","10","J","Q","K","A","2",};
		for (String n : nums) {
			for (String c :color ) {
				String card = c+n;
				cards.add(card);
				map.put(key, card);
				key++;
			}
		}
		cards.add("小王");
		cards.add("大王");
		map.put(key, "小王");
		key++;
		map.put(key, "大王");
//		System.out.println(cards);
//		System.out.println(map);
		//定义玩家
		ArrayList<Integer> p1 = new ArrayList<Integer>();
		ArrayList<Integer> p2 = new ArrayList<Integer>();
		ArrayList<Integer> p3 = new ArrayList<Integer>();
		ArrayList<Integer> dp = new ArrayList<Integer>();
		//洗牌
		Collections.shuffle(cards);
		for (int i = 1; i < cards.size()+1; i++) {
			if (i>51) {
				dp.add(i);
			}
			if (i%3 == 0) {
				//String card = cards.get(i);
				p1.add(i);
			}
			if (i%3 == 1) {
				//String card = cards.get(i);
				p2.add(i);
			}
			if (i%3 == 2){
				//String card = cards.get(i);
				p3.add(i);
			}
		}
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(dp);
		paixu(p1,map);
		paixu(p2,map);
		paixu(p3,map);
		paixu(dp,map);
			
	}

	private static void paixu(ArrayList<Integer> p1, Map<Integer, String> map) {
		// TODO Auto-generated method stub
		Collections.sort(p1);
		for (Integer integer : p1) {
			int key = integer;
			String card = map.get(key);
			System.out.print(card + " ");
			
		}
		System.out.println();
		//map.
	}

}

package com.m2q.day09_斗地主实现排序复习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义牌的集合
		ArrayList<String> cards = new ArrayList<String>();
		//将牌定义为一个集合
		Map<Integer, String> map = new HashMap<Integer, String>();
		//定义集合的第一个key
		int key = 1;
		//准备牌
		String[] color = {"♥","♣","♦","♠"};
		String[] nums = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		for (String n : nums) {
			for (String c : color) {
				String card = c+n;
				//System.out.println(card);
				//加入牌元素
				cards.add(card);
				//将牌加入集合
				map.put(key, card);
				//将牌的key进行自增
				key++;
			}
		}
		//将牌加入大小王
		cards.add("小王");
		cards.add("大王");
		//将大小王加入集合
		map.put(key, "小王");
		key++;
		map.put(key, "大王");
		//洗牌
		Collections.shuffle(cards);
		//定义参加打牌的人
		ArrayList<Integer> p1 = new ArrayList<Integer>();
		ArrayList<Integer> p2 = new ArrayList<Integer>();
		ArrayList<Integer> p3 = new ArrayList<Integer>();
		ArrayList<Integer> dp = new ArrayList<Integer>();
		//发牌(实际是发下标)
		for (int i = 1; i < cards.size()+1; i++) {
			if (i>51) {
				dp.add(i);
			}
			if (i%3 ==0) {
				p1.add(i);
			}
			if (i%3 ==1) {
				p2.add(i);
			}
			if (i%3 ==2) {
				p3.add(i);
			}
		}
		//将牌的下标跟集合中的key进行对应
		kanpai(p1,map);
		kanpai(p2,map);
		kanpai(p3,map);
		kanpai(dp,map);
	}

	private static void kanpai(ArrayList<Integer> p, Map<Integer, String> map) {
		// TODO Auto-generated method stub
		//将牌进行排序
		Collections.sort(p);
		for (Integer integer : p) {
			//得到map中的每个value
			String card = map.get(integer);
			System.out.print(card + " ");
		}
		System.out.println();
	}
	

}

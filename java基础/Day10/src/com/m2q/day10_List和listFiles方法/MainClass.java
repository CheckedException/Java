package com.m2q.day10_ListºÍlistFiles·½·¨;

import java.io.File;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\Files\\Desktop\\Java");
		File[] paths = file.listFiles();
		for (File path : paths) {
			System.out.println(path.getName());
		}
	}

}

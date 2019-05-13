package com.m2q.day10_遍历文件夹下面的所有文件复习;

import java.io.File;

public class MainClass {
	public static void main(String[] args){
		//建立文件位置
		File file = new File("D:\\Files\\Desktop\\Java");
		readFile(file);
	}
	public static void readFile(File file){
		MyFileter filter = new MyFileter();
		File[] files = file.listFiles();
		for (File file2 : files) {
			if (file2.isFile()) {
				//filter.accept(file2);
				if (file2.getName().endsWith(".png")) {
					System.out.println(file2);
				}
				
			}else{
				
				readFile(file2);
			}
		}
	}
}

package com.m2q.day10_遍历文件夹下面的所有文件;

import java.io.File;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//列出文件夹
		File file = new File("D:\\Files\\Desktop\\Java");
		//列出文件夹下面的所有文件或文件夹
		printFiles(file);
		
	}
	public static void printFiles(File file){
		File[] files = file.listFiles();
		for (File file2 : files) {
			if (file2.isFile()) {
				System.out.println(file2);
			}else{
				printFiles(file2);
			}
		}
	}

}

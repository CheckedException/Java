package com.m2q.day10_�����ļ�������������ļ�;

import java.io.File;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�г��ļ���
		File file = new File("D:\\Files\\Desktop\\Java");
		//�г��ļ�������������ļ����ļ���
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

package com.m2q.day01demo1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class HelloWorld_Re {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		FileWriter fw = new FileWriter("3.txt");
//		fw.write("asfdsafsdfasdfsadfsdfsaffdfsdafasfsadf");
//		fw.close();
		//Read file  3.txt
		FileReader fr = new FileReader("3.txt");
		char[] len = new char[20];
		int length = fr.read(len);
		//add cast to string
		String content = new String(len);
		System.out.println(content);
		fr.close();
	}

}

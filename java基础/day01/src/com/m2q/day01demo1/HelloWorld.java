package com.m2q.day01demo1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWorld {

	public static void main(String[] args) throws IOException {
//		FileWriter fw = new FileWriter("2.txt");
//		fw.write("asdfafdsaffa");
//		fw.close();
//		//Read Files
//		FileReader fr = new FileReader("2.txt");
//		char[] chr = new char[88];
//		int len = fr.read(chr);
//		String s = new String(chr);
//		System.out.println(s);
//		fr.close();
		FileWriter fw = new FileWriter("3.txt");
		fw.write("dafsdfasdfsafdfsdfsadfasdfad");
		fw.close();
		//Read File
		FileReader fr = new FileReader("3.txt");
		int len = fr.read();
		char[] chr = new char[len];
		int w =  fr.read(chr);
		String filecontent = new String(chr);
		System.out.println(filecontent);
		fr.close();
		
	}
}

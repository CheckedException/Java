package com.m2q.day10_File��Ĵ�����ɾ��;

import java.io.File;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D:\\Files\\Desktop\\Java\\a");
//		System.out.println(file);
//		//�����ļ�
//		boolean b = file.createNewFile();
//		if (b) {
//			System.out.println("�����ļ��ɹ�~");
//		}else{
//			System.out.println("�����ļ�ʧ��~");
//		}
		boolean b = file.mkdir();
		if (b) {
			System.out.println("�����ļ��гɹ�~");
		}else{
			System.out.println("�����ļ���ʧ��~");
		}
	}

}

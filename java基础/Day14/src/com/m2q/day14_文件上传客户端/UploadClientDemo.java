package com.m2q.day14_�ļ��ϴ��ͻ���;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class UploadClientDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//����Socket����
		Socket client = new Socket("127.0.0.1", 2555);
		//�����ļ��ϴ���
		OutputStream out = client.getOutputStream();
		//�����ļ���
		FileInputStream fis = new FileInputStream("D:\\Files\\Desktop\\Java\\Chrysanthemum.jpg");
		//��ȡ�ļ�
		byte[] bs = new byte[1024];
		int len = 0;
		while((len = fis.read(bs))!= -1){
			out.write(bs,0,len);
		}
		System.out.println("�ϴ����");
		fis.close();
		out.close();
		client.close();
	}

}

package com.m2q.day14_�ļ��ϴ�������BUG;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class UploadClientDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//����Client����
		Socket client = new Socket("127.0.0.1", 2555);
		//�����ϴ����ݶ���
		OutputStream out = client.getOutputStream();
		//������
		FileInputStream fis = new FileInputStream("D:\\Files\\Desktop\\Java\\Chrysanthemum.jpg");
		//�ϴ��ļ�
		byte[] bs = new byte[1024];
		int len = 0;
		while((len = fis.read(bs))!=-1){
			out.write(bs,0,len);
		}
		client.shutdownOutput();
		//
		System.out.println("�ر������");
		InputStream in = client.getInputStream();
		byte[] bs1 = new byte[1024];
		int len1 = in.read(bs1);
		System.out.println(new String(bs1, 0, len1));
		in.close();
		fis.close();
		out.close();
		client.close();
	}

}

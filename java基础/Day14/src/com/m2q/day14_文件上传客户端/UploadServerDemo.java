package com.m2q.day14_�ļ��ϴ��ͻ���;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServerDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//����Server����
		ServerSocket server = new ServerSocket(2555);
		//���ӿͻ���
		System.out.println("�ȴ��ͻ�������");
		Socket client = server.accept();
		System.out.println("�ͻ������ӳɹ�");
		//�����ļ�������
		InputStream in = client.getInputStream();
		//�����ļ������
		FileOutputStream fos = new FileOutputStream("D:\\Files\\Desktop\\Java\\file\\"+System.currentTimeMillis()+".jpg");
		byte[] bs = new byte[1024];
		int len = 0;
		while((len= in.read(bs))!= -1){
			System.out.println("����д������" + len);
			fos.write(bs,0,len);
		}
		System.out.println("�ϴ��ļ��ɹ�");
		fos.close();
		in.close();
		client.close();
		server.close();
	}

}

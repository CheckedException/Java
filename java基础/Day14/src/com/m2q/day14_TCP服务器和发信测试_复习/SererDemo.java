package com.m2q.day14_TCP�������ͷ��Ų���_��ϰ;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SererDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//����server����
		ServerSocket server = new ServerSocket(2555);
		//��ȡClient����
		System.out.println("���ڵȴ��ͻ�������");
		Socket client = server.accept();
		System.out.println("�ͻ������ӳɹ�");
		//��ȡ�ͻ��˷��͹���������
		InputStream in = client.getInputStream();
		byte[] bs = new byte[1024];
		int len = in.read(bs, 0, bs.length);
		System.out.println(new String(bs, 0,len));
		//�������ͻ�����Ϣ
		OutputStream out = client.getOutputStream();
		out.write("server�Ѿ��յ��������Ϣ".getBytes());
		//�ر���
		out.close();
		in.close();
		client.close();
		server.close();
		
	}

}

package com.m2q.day14_TCP�������ͷ��Ų���;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//����server�˶���
		ServerSocket server = new ServerSocket(2555);
		System.out.println("�ȴ��ͻ�������");
		Socket client = server.accept();
		System.out.println(client.getInetAddress().getHostAddress()+"���ӳɹ�");
		//��ȡ������������
		InputStream content = client.getInputStream();
		System.out.println("��ȡ���ݳɹ�");
		//��ȡ�ͻ��˷��͵�����
		byte[] bt = new byte[1024];
		content.read(bt);
		System.out.println(new String(bt, 0, bt.length));
		//�������ͻ�����Ϣ
		OutputStream out  = client.getOutputStream();
		out.write("�����Ϣ�Ѿ��յ���".getBytes());
		content.close();
		client.close();
		server.close();
	}

}

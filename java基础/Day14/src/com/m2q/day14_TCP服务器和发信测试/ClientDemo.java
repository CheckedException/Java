package com.m2q.day14_TCP�������ͷ��Ų���;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ClientDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//�����ͻ��˶���
		Socket client = new Socket("127.0.0.1", 2555);
		//�������ݸ�������
		client.getOutputStream().write("������".getBytes());
		//���շ���������
		InputStream in = client.getInputStream();
		byte[] bs = new byte[1024];
		int len = in.read(bs);
		System.out.println("�յ�����������"+ new String(bs, 0, len));
		//�ر�Socket
		client.close();
	}

}

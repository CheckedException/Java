package com.m2q.day14_TCP�������ͷ��Ų���_��ϰ;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {

	public static void main(String[] args) throws IOException, IOException {
		// TODO Auto-generated method stub
		//�����ͻ��˶���
		Socket client = new Socket("127.0.0.1", 2555);
		//���������������
		client.getOutputStream().write("�Ұ���".getBytes());
		//���տͻ��˷���
		byte[] bs = new byte[1024];
		InputStream in = client.getInputStream();
		int len = in.read(bs);
		System.out.println(new String(bs, 0, len));
		//�رտͻ�����
		in.close();
		client.close();
	}

}

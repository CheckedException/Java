package com.m2q.day14_UDP���ն�;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceiveDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//����DatagramScoket����
		DatagramSocket ds = new DatagramSocket(12345);
		while(true){
		//����DatagramPacket����
		byte[] bs = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bs, bs.length);
		System.out.println("�ȴ����Ͷ˷�������");
		ds.receive(dp);
		System.out.println("�������ݳɹ�");
		InetAddress Itaddress = dp.getAddress();
		System.out.println("���Ͷ���" + Itaddress.getHostAddress() );
		int len = dp.getLength();
		byte[] s = dp.getData();
		String content = new String(s,0,len);
		System.out.println("���͵�������:"+content);
		}
		//ds.close();
	}

}

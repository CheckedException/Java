package com.m2q.day15_UPDͨ�Ŷ�η���;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UDPReceive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//����DatagramScoket����
		DatagramSocket ds = new DatagramSocket(1553);
		while(true){

			//����DatagramPacket����
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf,buf.length);
			//��������
			System.out.println("�ȴ��Է���������");
			ds.receive(dp);
			InetAddress itAddress = dp.getAddress();
			System.out.println("�����ߵ�ַ��:" + itAddress.getHostAddress() );
			byte[] content = dp.getData();
			String contents = new String(content, 0, content.length);
			System.out.println("���͵�������:"+contents);
		}
	}

}

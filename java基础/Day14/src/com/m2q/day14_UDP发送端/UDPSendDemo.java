package com.m2q.day14_UDP���Ͷ�;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UDPSendDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//����DatagramSocket����
		DatagramSocket ds = new DatagramSocket();
		while(true){
		Scanner in = new Scanner(System.in);
		System.out.println("����������");
		String content = in.nextLine();
		//����DatagramPacket����
		byte[] bs = content.getBytes();
		DatagramPacket dp = new DatagramPacket(bs, bs.length, InetAddress.getLocalHost(), 12345);
		//����
		ds.send(dp);
		System.out.println("���ݷ��ͳɹ�");
		}
		//ds.close();
	}

}

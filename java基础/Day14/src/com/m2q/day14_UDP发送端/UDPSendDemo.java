package com.m2q.day14_UDP发送端;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UDPSendDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建DatagramSocket对象
		DatagramSocket ds = new DatagramSocket();
		while(true){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入内容");
		String content = in.nextLine();
		//创建DatagramPacket对象
		byte[] bs = content.getBytes();
		DatagramPacket dp = new DatagramPacket(bs, bs.length, InetAddress.getLocalHost(), 12345);
		//发送
		ds.send(dp);
		System.out.println("数据发送成功");
		}
		//ds.close();
	}

}

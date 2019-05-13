package com.m2q.day15_UPD通信多次发送;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UDPSend {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建DatagramScoket对象
		DatagramSocket ds = new DatagramSocket();
		while(true){
		//创建DatagramPacket对象
		Scanner in = new Scanner(System.in);
		System.out.println("请输入内容:");
		String content = in.nextLine();
		byte[] buf = content.getBytes();
		DatagramPacket dp = new DatagramPacket(buf, buf.length,InetAddress.getLocalHost(),1553);
		ds.send(dp);
		System.out.println("发送数据成功");
		}
	}

}

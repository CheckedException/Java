package com.m2q.day14_�ļ��ϴ�������BUG;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServerDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//����server����
		ServerSocket server = new ServerSocket(2555);
		System.out.println("�ȴ��ͻ������ӡ�����");
			//���пͻ�������
			Socket client = server.accept();
			System.out.println("�ͻ����������ɹ�");
			//�����ļ������
			FileOutputStream fos = new FileOutputStream("D:\\Files\\Desktop\\Java\\file\\"+System.currentTimeMillis()+".jpg");
			//��ȡ������
			InputStream in = client.getInputStream();
			//��ȡ������
			byte[] bs = new byte[1024];
			int len =0;
			while((len =in.read(bs))!= -1){
				fos.write(bs,0,len);
			}
//			in.close();
//			fos.close();
//			client.close();
			//server.close();
			System.out.println("�ļ��ϴ��ɹ�");
			OutputStream out = client.getOutputStream();
			out.write("�ļ��ϴ��ɹ�,���Բ鿴��".getBytes());
			out.close();
		
			
			in.close();
			fos.close();
			client.close();
			server.close();
	}


}

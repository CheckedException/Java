package com.m2q.day07.view;

import java.sql.Connection;
import java.util.Scanner;

import com.m2q.day07.utils.C3P0Utils;

public class TestClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("��ӭ������Ʒ����ϵͳ���밴�������������:");
		while(true)
		{
			System.out.println("C:����  U:�޸�  D:ɾ��  DA:ɾ������  FI:ͨ��ID��ѯ  FA:��ѯ����  Q:�˳�");
			Scanner in = new Scanner(System.in);
			String userScan = in.next();
			switch (userScan.toUpperCase()) {
			case "C":
				addProduct();
				break;
			case "U":
				editProduct();
				break;
			case "D":
				deleteProduct();
				break;
			case "DA":
				deleteAllProduct();
				break;
			case "FI":
				findById();
				break;
			case "FA":
				findAll();
				break;
			case "Q":
				System.out.println("��ӭ�ٴ�ʹ��");
				System.exit(0); 
				break;
	
			default:
				System.out.println("���������������������");
				break;
			}
		}
	}

	private static void findAll() {
		// TODO Auto-generated method stub
		System.out.println("��ѯ������Ʒ�ɹ�");
	}

	private static void findById() {
		// TODO Auto-generated method stub
		System.out.println("��ѯ������Ʒ�ɹ�");
	}

	private static void deleteAllProduct() {
		// TODO Auto-generated method stub
		System.out.println("ɾ��������Ʒ�ɹ�");
	}

	private static void deleteProduct() {
		// TODO Auto-generated method stub
		System.out.println("ɾ����Ʒ�ɹ�");
	}

	private static void editProduct() {
		// TODO Auto-generated method stub
		System.out.println("�޸���Ʒ�ɹ�");
	}

	private static void addProduct() {
		// TODO Auto-generated method stub
		System.out.println("������Ʒ�ɹ�");
	}

}

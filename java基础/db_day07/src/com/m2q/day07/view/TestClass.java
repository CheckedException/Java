package com.m2q.day07.view;

import java.sql.Connection;
import java.util.Scanner;

import com.m2q.day07.utils.C3P0Utils;

public class TestClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("欢迎来到商品管理系统，请按照如下命令操作:");
		while(true)
		{
			System.out.println("C:创建  U:修改  D:删除  DA:删除所有  FI:通过ID查询  FA:查询所有  Q:退出");
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
				System.out.println("欢迎再次使用");
				System.exit(0); 
				break;
	
			default:
				System.out.println("输入命令错误，请重新输入");
				break;
			}
		}
	}

	private static void findAll() {
		// TODO Auto-generated method stub
		System.out.println("查询所有商品成功");
	}

	private static void findById() {
		// TODO Auto-generated method stub
		System.out.println("查询单个商品成功");
	}

	private static void deleteAllProduct() {
		// TODO Auto-generated method stub
		System.out.println("删除所有商品成功");
	}

	private static void deleteProduct() {
		// TODO Auto-generated method stub
		System.out.println("删除商品成功");
	}

	private static void editProduct() {
		// TODO Auto-generated method stub
		System.out.println("修改商品成功");
	}

	private static void addProduct() {
		// TODO Auto-generated method stub
		System.out.println("新增商品成功");
	}

}

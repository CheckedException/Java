package com.m2q.day07.view;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.omg.PortableInterceptor.INACTIVE;

import com.m2q.day07.domain.Product;
import com.m2q.day07.service.ProductService;
import com.m2q.day07.utils.C3P0Utils;

public class ProcductView {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("欢迎来到商品管理系统，请按照如下命令操作:");
		while (true) {
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
		ProductService ps = new ProductService();
		List<Product> p = ps.findAll();
		if (p.isEmpty()) {
			System.out.println("目前不存在商品信息。");
		} else {
			for (Product product : p) {
				System.out.println(product);
			}
			System.out.println("查询所有商品成功");
		}

	}

	private static void findById() {
		// TODO Auto-generated method stub
		System.out.println("请输入要查询的ID");
		Scanner in = new Scanner(System.in);
		int id = Integer.parseInt(in.nextLine());
		ProductService ps = new ProductService();
		Product p = ps.findById(id);
		if (p == null) {
			System.out.println("你输入的商品编号不存在");
		} else {
			System.out.println("你的商品信息是:" + p);
			System.out.println("查询单个商品成功");
		}

	}

	private static void deleteAllProduct() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ProductService ps = new ProductService();
		List<Integer> ids = new ArrayList<Integer>();
		while (true) {
			System.out.println("请输入要删除的商品号(-1结束)");
			
			int id = Integer.parseInt(in.nextLine());
			if (id == -1) {
				break;
			}
			Product p = ps.findById(id);
			if (p == null) {
				System.out.println("该商品不存在请确认");
			} else {
				System.out.println("已成功标记该商品");
				ids.add(id);
				}
			}
		if (ids.isEmpty()) {
			System.out.println("该操作已经取消");
		}else{
			System.out.println("你确认要删除"+ids.size()+"个商品吗？Y/N");
			String isOrNot = in.nextLine();
			if ("Y".equals(isOrNot)) {
				ps.delteAll(ids);
				System.out.println("删除商品成功");
			}else{
				System.out.println("操作取消");
			}
		}

	}

	private static void deleteProduct() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("请输入你要删除的商品编号:");
		int id = Integer.parseInt(in.nextLine());
		ProductService ps = new ProductService();
		Product p = ps.findById(id);
		if (p == null) {
			System.out.println("需要删除的Id不存在.");
		} else {
			System.out.println("你需要删除的商品信息为" + p);
			System.out.println("你需要删除吗?Y/N");
			String isOrNo = in.nextLine();
			if ("Y".equals(isOrNo)) {
				ps.deleteById(id);
				System.out.println("删除商品成功");
			} else {
				System.out.println("删除操作取消");
			}
		}

	}

	private static void editProduct() {
		// TODO Auto-generated method stub
		System.out.println("请输入要修改的商品编号:");
		Scanner in = new Scanner(System.in);
		int id = Integer.parseInt(in.nextLine());
		ProductService ps = new ProductService();
		Product p = ps.findById(id);
		if (p == null) {
			System.out.println("你输入的商品编号" + id + "不存在");
		} else {
			System.out.println("你将要修改的商品信息是" + p);
			System.out.println("请输入要修改的商品名称：");
			String newPname = in.nextLine();
			System.out.println("请输入要修改的商品价格：");
			int newPrice = Integer.parseInt(in.nextLine());
			p.setPname(newPname);
			p.setPrice(newPrice);
			p.setPid(id);
			ps.editProduct(p);
			System.out.println("修改商品成功");
		}

	}

	private static void addProduct() {
		// TODO Auto-generated method stub
		System.out.println("请输入商品名称");
		Scanner sc = new Scanner(System.in);
		String pname = sc.nextLine();
		System.out.println("请输入商品价格");
		// Scanner sc2 = new Scanner(System.in);
		int price = Integer.parseInt(sc.nextLine());
		Product p = new Product(pname, price);
		ProductService ps = new ProductService();
		ps.addProduct(p);
		System.out.println("新增商品成功");
	}

}

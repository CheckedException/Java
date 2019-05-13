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
		System.out.println("��ӭ������Ʒ����ϵͳ���밴�������������:");
		while (true) {
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
		ProductService ps = new ProductService();
		List<Product> p = ps.findAll();
		if (p.isEmpty()) {
			System.out.println("Ŀǰ��������Ʒ��Ϣ��");
		} else {
			for (Product product : p) {
				System.out.println(product);
			}
			System.out.println("��ѯ������Ʒ�ɹ�");
		}

	}

	private static void findById() {
		// TODO Auto-generated method stub
		System.out.println("������Ҫ��ѯ��ID");
		Scanner in = new Scanner(System.in);
		int id = Integer.parseInt(in.nextLine());
		ProductService ps = new ProductService();
		Product p = ps.findById(id);
		if (p == null) {
			System.out.println("���������Ʒ��Ų�����");
		} else {
			System.out.println("�����Ʒ��Ϣ��:" + p);
			System.out.println("��ѯ������Ʒ�ɹ�");
		}

	}

	private static void deleteAllProduct() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ProductService ps = new ProductService();
		List<Integer> ids = new ArrayList<Integer>();
		while (true) {
			System.out.println("������Ҫɾ������Ʒ��(-1����)");
			
			int id = Integer.parseInt(in.nextLine());
			if (id == -1) {
				break;
			}
			Product p = ps.findById(id);
			if (p == null) {
				System.out.println("����Ʒ��������ȷ��");
			} else {
				System.out.println("�ѳɹ���Ǹ���Ʒ");
				ids.add(id);
				}
			}
		if (ids.isEmpty()) {
			System.out.println("�ò����Ѿ�ȡ��");
		}else{
			System.out.println("��ȷ��Ҫɾ��"+ids.size()+"����Ʒ��Y/N");
			String isOrNot = in.nextLine();
			if ("Y".equals(isOrNot)) {
				ps.delteAll(ids);
				System.out.println("ɾ����Ʒ�ɹ�");
			}else{
				System.out.println("����ȡ��");
			}
		}

	}

	private static void deleteProduct() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("��������Ҫɾ������Ʒ���:");
		int id = Integer.parseInt(in.nextLine());
		ProductService ps = new ProductService();
		Product p = ps.findById(id);
		if (p == null) {
			System.out.println("��Ҫɾ����Id������.");
		} else {
			System.out.println("����Ҫɾ������Ʒ��ϢΪ" + p);
			System.out.println("����Ҫɾ����?Y/N");
			String isOrNo = in.nextLine();
			if ("Y".equals(isOrNo)) {
				ps.deleteById(id);
				System.out.println("ɾ����Ʒ�ɹ�");
			} else {
				System.out.println("ɾ������ȡ��");
			}
		}

	}

	private static void editProduct() {
		// TODO Auto-generated method stub
		System.out.println("������Ҫ�޸ĵ���Ʒ���:");
		Scanner in = new Scanner(System.in);
		int id = Integer.parseInt(in.nextLine());
		ProductService ps = new ProductService();
		Product p = ps.findById(id);
		if (p == null) {
			System.out.println("���������Ʒ���" + id + "������");
		} else {
			System.out.println("�㽫Ҫ�޸ĵ���Ʒ��Ϣ��" + p);
			System.out.println("������Ҫ�޸ĵ���Ʒ���ƣ�");
			String newPname = in.nextLine();
			System.out.println("������Ҫ�޸ĵ���Ʒ�۸�");
			int newPrice = Integer.parseInt(in.nextLine());
			p.setPname(newPname);
			p.setPrice(newPrice);
			p.setPid(id);
			ps.editProduct(p);
			System.out.println("�޸���Ʒ�ɹ�");
		}

	}

	private static void addProduct() {
		// TODO Auto-generated method stub
		System.out.println("��������Ʒ����");
		Scanner sc = new Scanner(System.in);
		String pname = sc.nextLine();
		System.out.println("��������Ʒ�۸�");
		// Scanner sc2 = new Scanner(System.in);
		int price = Integer.parseInt(sc.nextLine());
		Product p = new Product(pname, price);
		ProductService ps = new ProductService();
		ps.addProduct(p);
		System.out.println("������Ʒ�ɹ�");
	}

}

package com.m2q.day07.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.m2q.day07.dao.ProductDao;
import com.m2q.day07.domain.Product;
import com.m2q.day07.utils.C3P0Utils;
import com.m2q.day07.utils.ConnectionManager;

public class ProductService {

	
	//批量删除商品
	public void delteAll(List<Integer> ids){
		ProductDao pd = new ProductDao();
			try {
				ConnectionManager.start();
				pd.deleteAll(ids);
				ConnectionManager.commit();
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

				try {
					ConnectionManager.rollback();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
		}
	}
	//根据Id删除商品
	public void deleteById(int id){
		ProductDao pd = new ProductDao();
		try {
			pd.deleteByOneId(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		ProductDao pd = new ProductDao();
		try {
			pd.addProduct(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Product findById(int id) {
		// TODO Auto-generated method stub
		ProductDao pd = new ProductDao();
		Product p = null;
		try {
			p = pd.findById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;

	}

	public void editProduct(Product p) {
		// TODO Auto-generated method stub
		ProductDao pd = new ProductDao();
		try {
			pd.editProduct(p);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Product> findAll() {
		// TODO Auto-generated method stub
		ProductDao pd = new ProductDao();
		List<Product> p = null;
		try {
			p = pd.findAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

}

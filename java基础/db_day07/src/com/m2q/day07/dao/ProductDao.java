package com.m2q.day07.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.m2q.day07.domain.Product;
import com.m2q.day07.service.ProductService;
import com.m2q.day07.utils.C3P0Utils;
import com.m2q.day07.utils.ConnectionManager;

public class ProductDao {
	
	//批量删除商品
	public void deleteAll(List<Integer> ids) throws Exception{
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		for (Integer id : ids) {
			Connection conn = ConnectionManager.getConnection();
			qr.update(conn,"delete from products where pid = ?", id);
			//System.out.println(1/0);
		}
	}
	//删除商品
	public void deleteByOneId(int id) throws SQLException{
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		qr.update("DELETE FROM PRODUCTS WHERE PID = ?", id);
	}
	
	//删除商品
		public void deleteById(int id) throws SQLException{
			QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
			qr.update("DELETE FROM PRODUCTS WHERE PID = ?", id);
		}

	public void addProduct(Product p) throws Exception {
		// TODO Auto-generated method stub
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		Object[] params = {p.getPname(),p.getPrice(),0,"c004"};
		qr.update("insert into products(pname,price,flag,category_id)values(?,?,?,?)", params);
	}

	public Product findById(int id) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		Product p = qr.query("select * from products where pid = ?", new BeanHandler<Product>(Product.class), id);
		return p;
	}

	public void editProduct(Product p) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		Object[] param = {p.getPname(),p.getPrice(),p.getPid()};
		qr.update("update products set pname = ?,price = ? where pid = ?", param);
	}

	public List<Product> findAll() throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		List<Product> p = qr.query("select * from products", new BeanListHandler<Product>(Product.class));
		return p;
	}

}

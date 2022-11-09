package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exceptions.ProductException;
import com.models.Product;
import com.utility.DBUtil;

public class ProductDaoImpl implements ProductDao{

	@Override
	public String addProduct(Product product) throws ProductException {

		String res = "Product Not Added";
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into product values(?, ?, ?, ?)");
			
			ps.setInt(1, product.getProductId());
			ps.setString(2, product.getProductName());
			ps.setInt(3, product.getPrice());
			ps.setInt(4, product.getQuantity());
			
			int i = ps.executeUpdate();
			
			if(i > 0) res = "Product Added Successfully";
			
		} catch (SQLException e) {
			res = e.getMessage();
		}
		return res;
	}

	@Override
	public List<Product> getAllProducts() throws ProductException {
		
		List<Product> products = new ArrayList<>();
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from product");			
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int productId = rs.getInt("productId");
				String productName = rs.getString("productName");
				int price = rs.getInt("price");
				int quantity = rs.getInt("quantity");
				
				Product product = new Product(productId, productName, price, quantity);
				
				products.add(product);
			}
			
			if(products.size() == 0)
				throw new ProductException("Products not in the store...");
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		return products;
	}

	@Override
	public List<Product> getAllProductQuantityLessThan(int quantity) throws ProductException {
		
		List<Product> products = new ArrayList<>();
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from product where quantity < ?");
			
			ps.setInt(1, quantity);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int productId = rs.getInt("productId");
				String productName = rs.getString("productName");
				int price = rs.getInt("price");
				int quantity1 = rs.getInt("quantity");
				
				Product product = new Product(productId, productName, price, quantity1);
				
				products.add(product);

			}
			
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		if(products.size() == 0)
			throw new ProductException("Products not in the store with given data...");
		
		return products;
		
	}

	@Override
	public String addProductQuantity(int productId, int Quantity) throws ProductException {

		String isUpdated = "Quantity not updated";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps1 = conn.prepareStatement("select quantity from product where productid=?");
			
			ps1.setInt(1, productId);
			
			ResultSet rs = ps1.executeQuery();
			
			if(rs.next()) {
				
				Quantity = Quantity + rs.getInt("quantity");
				
			}
			
			PreparedStatement ps = conn.prepareStatement("update product set quantity=? where productid=?");
			
			ps.setInt(1, Quantity);
			ps.setInt(2, productId);
			
			int out = ps.executeUpdate();
			
			if(out > 0) {
				isUpdated = "Quantity updated successfully";
			}
			else
				throw new ProductException("Products not in the store with given data...");
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		return isUpdated;
	}

	@Override
	public String deleteProductByProductName(String pname) throws ProductException {


		String isAdded = "Product is not deleted...";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("delete from product where productName=?");
			
			ps.setString(1, pname);
			
			
			int out = ps.executeUpdate();
			
			if(out > 0) {
				isAdded = "Product deleted successfully!";
			}
			else 
				throw new ProductException("Product not deleted");
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		return isAdded;
		
	}

	@Override
	public Product getProductByProductName(String pname) throws ProductException {
		
		Product product = null;
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from product where productName=?");
			
			ps.setString(1, pname);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				int productId = rs.getInt("productId");
				String productName = rs.getString("productName");
				int price = rs.getInt("price");
				int quantity = rs.getInt("quantity");
				
				product = new Product(productId, productName, price, quantity);
				
			}
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		if(product == null)
			throw new ProductException("Products not in the store...");
		
		return product;
		
	}	

}

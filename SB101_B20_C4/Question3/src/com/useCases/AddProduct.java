package com.useCases;

import java.util.Scanner;

import com.dao.ProductDao;
import com.dao.ProductDaoImpl;
import com.exceptions.ProductException;
import com.models.Product;

public class AddProduct {

	public static void main(String[] args) {
		
		ProductDao ps = new ProductDaoImpl();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter product id");
		int productid = scan.nextInt();
		
		System.out.println("Enter the product name");
		String productName = scan.next();
		
		System.out.println("Enter product price");
		int price = scan.nextInt();
		
		System.out.println("Enter  product quantity");
		int quantity = scan.nextInt();
		
		scan.close();
		
		Product product = new Product(productid, productName, price, quantity);
		
		try {
			
			String message = ps.addProduct(product);
			
			System.out.println(message);
			
		} catch (ProductException e) {
			System.out.println(e.getMessage());
		}
	}
}


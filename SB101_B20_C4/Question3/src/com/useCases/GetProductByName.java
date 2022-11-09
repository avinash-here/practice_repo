package com.useCases;

import java.util.Scanner;

import com.dao.ProductDao;
import com.dao.ProductDaoImpl;
import com.exceptions.ProductException;
import com.models.Product;

public class GetProductByName {

	public static void main(String[] args) {
		
		ProductDao ps = new ProductDaoImpl();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the product name");
		String productName = scan.next();
		scan.close();
		
		try {
			
			Product product = ps.getProductByProductName(productName);
			
			System.out.println(product);
			
		} catch (ProductException e) {
			System.out.println(e.getMessage());
		}
		
	}

}

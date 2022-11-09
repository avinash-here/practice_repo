package com.useCases;

import java.util.List;
import java.util.Scanner;

import com.dao.ProductDao;
import com.dao.ProductDaoImpl;
import com.exceptions.ProductException;
import com.models.Product;

public class GetProductByQuantity {

	
	public static void main(String[] args) {
		
		ProductDao ps = new ProductDaoImpl();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter quantity");
		int quantity = scan.nextInt();
		
		scan.close();
		
		try {
			
			List<Product> products = ps.getAllProductQuantityLessThan(quantity);
			
			products.forEach(product -> System.out.println(product));
			
		} catch (ProductException e) {
			System.out.println(e.getMessage());
		}
		
	}
}

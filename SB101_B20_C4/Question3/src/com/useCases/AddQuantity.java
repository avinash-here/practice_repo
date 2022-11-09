package com.useCases;

import java.util.Scanner;

import com.dao.ProductDao;
import com.dao.ProductDaoImpl;
import com.exceptions.ProductException;

public class AddQuantity {

	public static void main(String[] args) {
		
		ProductDao ps = new ProductDaoImpl();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter product id");
		int productid = scan.nextInt();
		System.out.println("Enter  product quantity");
		int quantity = scan.nextInt();
		scan.close();
		
		try {
			
			String message = ps.addProductQuantity(productid, quantity);
			
			System.out.println(message);
			
		} catch (ProductException e) {
			System.out.println(e.getMessage());
		}
		
	}

}


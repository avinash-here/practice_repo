package com.useCases;

import java.util.Scanner;

import com.dao.ProductDao;
import com.dao.ProductDaoImpl;
import com.exceptions.ProductException;

public class DeleteByProductName {

	public static void main(String[] args) {

		
		ProductDao ps = new ProductDaoImpl();

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Product Name :");
		String pName=   scan.next();
		scan.close();

		try {
			
			String message = ps.deleteProductByProductName(pName);
			
			System.out.println(message);
			
		} catch (ProductException e) {
			System.out.println(e.getMessage());	
		}
	}

}


package com.useCases;

import java.util.Scanner;

import com.dao.ProductDao;
import com.dao.ProductDaoImpl;
import com.exceptions.ProductException;
import com.models.Product;

public class DeleteProductWhoseNameStartsWith {
	
	public static void main(String[] args) {

		
		ProductDao ps = new ProductDaoImpl();

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Starting character of Product :");
		String pName=   scan.next();
		scan.close();

		try {
			
			String message = ps.deleteProductWhoseNameStart(pName);
			
			if(message != null)
			System.out.println(message);
			
		} catch (ProductException e) {
			System.out.println(e.getMessage());	
		}
	}


}

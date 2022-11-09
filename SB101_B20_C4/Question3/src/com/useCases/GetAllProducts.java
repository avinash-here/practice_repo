package com.useCases;

import java.util.List;

import com.dao.ProductDao;
import com.dao.ProductDaoImpl;
import com.exceptions.ProductException;
import com.models.Product;

public class GetAllProducts {

	public static void main(String[] args) {


		ProductDao ps = new ProductDaoImpl();
		
		try {
			
			List<Product> products = ps.getAllProducts();
			
			products.forEach(product -> System.out.println(product));
			
		} catch (ProductException e) {
			System.out.println(e.getMessage());
		}
	}

}

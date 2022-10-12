package com.p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Main {
	
	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product(1, "Pen", 10, 5));
		products.add(new Product(2, "Pencil", 5, 2));
		products.add(new Product(3, "Rubber", 5, 1));
		products.add(new Product(4, "Sharpner", 8, 1));
		products.add(new Product(5, "Scale", 12, 5));
		products.add(new Product(6, "Compass", 20, 1));
		
		
		Collections.sort(products,  (p1, p2) -> p2.getPrice() - p1.getPrice());
		
		products.removeIf(p -> p.getQuantity() < 2);
		
		Consumer<Product> cons = System.out::println;		
		for(Product p : products) {
			cons.accept(p);
		}
			
	}
	
	

}

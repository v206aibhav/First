package com.phoenix.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.phoenix.models.Product;

public class ProductSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Product> productSet=new HashSet<Product>();
		productSet.add(new Product(1002,"Mobile","Samsung",23500.00f));
		productSet.add(new Product(1005,"Laptop","Asus",43500.00f));
		productSet.add(new Product(1003,"Refrigerator","Whirlpool",13500.00f));
		productSet.add(new Product(1001,"UHD TV","Sony",53500.00f));
		productSet.add(new Product(1002,"Mobile","Samsung",23500.00f));
		
		System.out.println("Before sorting");
		for(Product product : productSet){
			System.out.println(product);
		}

		
	}

}

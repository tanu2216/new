package com.cg.productmgmt.ui;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import com.cg.productmgmt.dao.IProductDAO;
import com.cg.productmgmt.dao.ProductDAO;
import com.cg.productmgmt.exceptions.ProductException;
import com.cg.productmgmt.service.IProductService;
import com.cg.productmgmt.service.ProductService;

public class Client {

	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
	
		IProductDAO iProductDAO= new ProductDAO();
		IProductService iProductService = new ProductService(iProductDAO);
		int choice;
		while(true) {
			System.out.println("Please Enter Your Choice:");
			System.out.println("1. Update Product Price");
			System.out.println("2. Exit");
			choice= sc.nextInt();
			sc.nextLine();
			switch(choice) {
			
			case 1:	System.out.println("Enter the Product Category: ");
					String category= sc.next();
					sc.nextLine();
					System.out.println("Enter the hike price: ");
					int hike = sc.nextInt();
					hike=validatePrice(hike);
					try {
						int updated = iProductService.updateProducts(category,hike);
						System.out.println(updated+"Products updated successfully");
						System.out.println();
					}	
					catch (ProductException e) {
						System.out.println("Category does not exist");
						System.out.println();
					}
					
					try {
						
						Map<String, Integer> productDetails=iProductService.getProductDetails();
						Iterator<String> iterator = productDetails.keySet().iterator();

						while(iterator.hasNext()) {
							String key= iterator.next();							
							System.out.println(key+" "+productDetails.get(key));
						}
					}	
					catch (ProductException e) {
						System.out.println("Category does not exist%n%n%n");
					}
					break;
					
			case 2: System.out.println("Exitting..");
					System.exit(0);
					break;
					
			default: System.out.println("Wrong choice!!. Please enter correct choice!");
					
			
			}
		}
		
	}
	private static int validatePrice(int hike) {
		
		if(hike<0)
		{
			System.out.println("please enter hike price greater than 0");
			int hikeprice=sc.nextInt();
			sc.nextLine();
			validatePrice(hikeprice);
		}
		return hike;
		
		
	}

}

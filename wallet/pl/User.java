package com.cg.wallet.pl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.wallet.bean.Customer;
import com.cg.wallet.exception.balanceException;
import com.cg.wallet.exception.inputException;
import com.cg.wallet.service.WalletServiceImpl;

public class User {
	
	 WalletServiceImpl service;
	 
	private  Map<String,Customer> data=new HashMap<>();
	
	public User()
	{
		System.out.println("Welcome ");
		service= new WalletServiceImpl(data);
	}
	
	public void Options()
	{
		System.out.println("1) Create Account");
		System.out.println("2) Check Your Balance");
		System.out.println("3) Exit");
		
		Scanner scanner=new Scanner(System.in);
		
		String phone;
		BigDecimal balance;
		String name;
		Customer customer;
		switch (scanner.nextInt()) 
		{
			case 1: 
				
					System.out.print("Enter Your Name          : ");
					name=scanner.next();
					
					System.out.print("Enter Your Mobile Number  : ");
					phone=scanner.next();
					
					System.out.print("Enter Balance         : ");
					balance=scanner.nextBigDecimal();
				
			        try {
			        	Customer customer1=service.createAccount(name, phone, balance);
			        	
			        	System.out.println("Thank you, "+customer1.getName()+" Your Payment wallet account has been created successfully with Balance "+balance);
			            }
			        catch (inputException e) 
			            {
			        	System.out.println(e.getMessage());
			            }
				 
					break;
			case 2:					
				
				  System.out.print("Enter the Mobile Number : ");
				 phone=scanner.next();
				
			    try 
			    {
			    	customer=service.showBalance(phone);
			    	System.out.println("Your Current Balance is "+customer.getWallet().getBalance());
			    } 
			    catch (inputException | balanceException e)
			    {
			    	System.out.println(e.getMessage());				
			    }
			
			break;
			case 3:
				System.out.println("Exited...");
				break;
		}
	}
	
					
	public static void main(String[] args) {
			User user=new User();
		while(true)
		{
			 user.Options();
		}
	}
	}

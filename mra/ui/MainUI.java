package com.cg.mra.ui;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.MobileRechargeException;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

/**
 * 
 * Date: 22nd Oct., 2018
 * Author: Vamshidhar Thonti
 *
 */

public class MainUI {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountService service = null;

		int option = 0;

		do {
//			This is to display the menu
			System.out.println("1. Account Balance Enquiry");
			System.out.println("2. Recharge Account");
			System.out.println("3. Exit");

			option = sc.nextInt();

			switch (option) {
			case 1:
				//Case1: is to take inputs from the user and to validate the user inputs
				service = new AccountServiceImpl();
				
				System.out.println("Enter Mobile No: ");
				String mobNo = sc.next();
				validateMobNo(mobNo);
					
				Account acc=null;
				try {
					acc = service.getAccountDetails(mobNo);
				}
				catch (MobileRechargeException e) {
					
					e.getMessage();
				}
				
				System.out.println("Your Current Balance is Rs. "+acc.getAccountBalance());

				break;

			case 2:
				//case2: is to take input from user and recharge the account and display the current balance
				service = new AccountServiceImpl();
				
				System.out.println("Enter MobileNo: ");
				String mobileNo = sc.next();
				try {
				if(!validateMobNo(mobileNo))
					
						throw new MobileRechargeException("Inavlid Mobile Number...");
					} catch (MobileRechargeException e) {
					
						e.getMessage();
					}
				System.out.println("Enter Recharge Amount: ");
				double reAmt = sc.nextDouble();
				try {
					if(!validateAmount(reAmt))
						throw new MobileRechargeException("Invalid amount entered...");
					}
				catch (MobileRechargeException e) {
				
						e.getMessage();
					}
				
				try {
					service.rechargeAccount(mobileNo, reAmt);
				} catch (MobileRechargeException e) {
					
					e.getMessage();
				}
				
				break;

			default:
			case 3:
				System.out.println("Exited...");
				break;
			}

		} while (option != 3);
		sc.close();
	}
	
	public static boolean validateMobNo(String mobNo) {
		boolean b= true;
		Pattern pat = Pattern.compile("[6-9][0-9]{9}");
		Matcher mat = pat.matcher(mobNo);
		if(mat.matches()) {
			return true;
		}
		else {
			System.out.println("Please enter valid mobile number:");
			String mob= sc.nextLine();
			validateMobNo(mob);
		}
		return true;
	}

	//Method to validate the amount
	
	public static boolean validateAmount(double reAmt) {
		// TODO Auto-generated method stub
		Pattern pat = Pattern.compile("[1-9][0-9.]{0,15}");
		Matcher mat = pat.matcher(String.valueOf(reAmt));
		return mat.matches();
	}

}

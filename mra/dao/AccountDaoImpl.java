package com.cg.mra.dao;

import java.util.Map;
import java.util.Set;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.MobileRechargeException;

public class AccountDaoImpl implements AccountDao {
	
	Map<String, Account> accountEntry;
	
	public AccountDaoImpl() {
		
		accountEntry = DataContainer.createCollection();
		accountEntry.put("9010210131", new Account("Prepaid", "Vaishali", 200));
		accountEntry.put("9823920123", new Account("Prepaid", "Megha", 453));
		accountEntry.put("9897496567", new Account("Prepaid", "Nitisha", 631));
		accountEntry.put("9010210132", new Account("Prepaid", "Anju", 521));
		accountEntry.put("9010210133", new Account("Prepaid", "Tushar", 632));
		
	}

	@Override
	public Account getAccountDetails(String mobileNo) throws MobileRechargeException {
		// TODO Auto-generated method stub
		
		if(accountEntry.containsKey(mobileNo)) {
			Account ac = accountEntry.get(mobileNo);
			return ac;
		}
		else{
		
			throw new MobileRechargeException("Mobile number does not exist");		
		}
	}
	@Override
	public double rechargeAccount(String mobileNo, double rechargeAmount) throws MobileRechargeException {
	
		if(accountEntry.containsKey(mobileNo)) {
			Account ac = accountEntry.get(mobileNo);
			double bal = ac.getAccountBalance()+rechargeAmount;
			System.out.println("Your Account Recharged Successfully");
			System.out.println("Hello "+ac.getCustomerName()+", Available Balance is "+bal);
			return bal;
		}
		
		else{
			throw new MobileRechargeException("Mobile number does not exist!!");
	}
}
}

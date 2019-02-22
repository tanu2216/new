package com.wallet.dao;

import java.util.Set;

import com.wallet.dto.Customer;

public interface BankDAO {
	
	public Customer createAccount(Customer c);
	public Customer getAccount(String mobileno);
	public boolean setAccount(String mobileNo, double amount);
	public Set<String> getKeys();

}

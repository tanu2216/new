package com.cg.wallet.repository;

import java.util.Map;

import com.cg.wallet.bean.Customer;

public class WalletRepository implements IWalletRepository{
	
	private Map<String,Customer> data;
	
	public  WalletRepository(Map<String, Customer> data) 
	{
		super();
		this.data = data;
	}

	@Override
	public boolean save(Customer customer) {
		if(data.containsKey(customer.getPhone()))
		{
			data.replace(customer.getPhone(), customer);
		}
		else
			data.put(customer.getPhone(), customer);
	
		return true;
	}

	@Override
	public Customer findByPhone(String phone) {
		Customer customer=null;
				
		customer=data.get(phone);
		return customer;
	}
	

}

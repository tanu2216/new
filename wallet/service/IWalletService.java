package com.cg.wallet.service;

import java.math.BigDecimal;

import com.cg.wallet.bean.Customer;

public interface IWalletService {

	public Customer createAccount(String name,String phone,BigDecimal balance);
	public Customer showBalance(String phone);
}

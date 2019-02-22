package com.cg.wallet.bean;

import java.math.BigDecimal;

public class Wallet {
	 //private int id;
	 private BigDecimal balance;
	  
	public Wallet( BigDecimal balance) {
		super();
		//this.id = id;
		this.balance = balance;
	}
	/*public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}*/
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Wallet [balance=" + balance + "]";
	}
	 
	 

}

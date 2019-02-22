package com.cg.wallet.bean;

public class Customer {
	 private String name;
	 private String phone;
	 private Wallet wallet;
	 
		public Customer()
		{
			super();
		}
	 
	public Customer(String name, String phone, Wallet wallet)
	{
		super();
		this.name = name;
		this.phone = phone;
		this.wallet = wallet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", phone=" + phone + ", wallet=" + wallet + "]";
	}
	 
	 
}

package com.cg.wallet.service;
import com.cg.wallet.bean.Wallet;
import java.math.BigDecimal;
import java.util.Map;

import com.cg.wallet.bean.Customer;
import com.cg.wallet.exception.inputException;
import com.cg.wallet.repository.WalletRepository;

public class WalletServiceImpl implements IWalletService{
	
	WalletRepository repository;
	
	public WalletServiceImpl(Map<String,Customer> data)
	
			{
		repository= new WalletRepository(data);
	}
	public WalletServiceImpl(WalletRepository repository) 
	{
		super();
		this.repository = repository;
	}
	
	@Override
	public Customer createAccount(String name, String phone, BigDecimal balance) {
	Customer customer=null;
		
		if(isValidName(name) && isValidMobile(phone) && isValidamount(balance))
		{
		customer=new Customer(name,phone,new Wallet(balance));
		if(repository.findByPhone(phone) != null)
			throw new inputException("The account with mobile Number "+ phone+" is already created");
		repository.save(customer);
		}
		
		return customer;
	}

	@Override
	public Customer showBalance(String phone) {
		Customer customer=null;
		if(isValidMobile(phone))
		{
		  customer=repository.findByPhone(phone);
		}
		if(customer == null)
			throw new inputException("The mobile Number You Entered is Not having Payment Wallet Account");
		return customer;
	}
	
	public boolean isValidName(String name) throws inputException 
	{
		if( name == null)
			throw new inputException( "Sorry, Customer Name is null" );
		
		if( name.trim().isEmpty() )
			throw new inputException( "Sorry, customer Name is Empty" );
		
		return true;
	}

	public boolean isValidMobile(String phone)throws inputException
	{
		if( phone == null ||  isPhoneNumberInvalid( phone ))
			throw new inputException( "Sorry, Phone Number "+phone+" is invalid"  );
		
		return true;
	}

	public boolean isValidamount(BigDecimal balance)throws inputException
	{
		if( balance == null || isAmountInvalid( balance ) )
			throw new inputException( "Amount is invalid" );

		return true;
	}

	public boolean isAmountInvalid(BigDecimal balance) 
	{
		
		if( balance.compareTo(new BigDecimal(0)) < 0) 
		{
			return true;
		}		
		else 
			return false;
	}

	public static boolean isPhoneNumberInvalid( String phone )
	{
		if(String.valueOf(phone).matches("[1-9][0-9]{9}")) 
		{
			return false;
		}		
		else 
			return true;
	}
}

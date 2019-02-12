package com.cg.productmgmt.dao;

import java.util.Map;

import com.cg.productmgmt.exceptions.ProductException;

public interface IProductDAO {
	
	public int updateProduct(String catogory, int hikePrice) throws ProductException;
	public Map<String, Integer> getProductDetails() throws ProductException;

}

package com.cg.productmgmt.service;

import java.util.Map;

import com.cg.productmgmt.exceptions.ProductException;

public interface IProductService {

	public int updateProducts(String category, int hikePrice) throws ProductException;	
	public Map<String, Integer> getProductDetails() throws  ProductException;
	
}

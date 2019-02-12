package com.cg.productmgmt.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.cg.productmgmt.dao.IProductDAO;
import com.cg.productmgmt.dao.ProductDAO;
import com.cg.productmgmt.exceptions.ProductException;
import com.cg.productmgmt.service.IProductService;
import com.cg.productmgmt.service.ProductService;

public class ProductManagementTesting {

	/*	updateProduct
	 * 1. when non-existing product category is passed system should throw Product Exception
	 * 2. when existing product category is passed system should update details of that category 
	 */
	
	IProductDAO iProductDAO= new ProductDAO();
	
	IProductService iProductService=new ProductService(iProductDAO); 
	
	@Before
	public void setUp() throws Exception {}
	
	
	@Test(expected=ProductException.class)
	public void whenInvalidCategoryIsPassedSystemShouldThrowException() throws ProductException {
		
		iProductService.updateProducts("abcd",10);
	}
	
	@Test
	public void whenValidProductCategoryIsPassedSystemShouldUpdateTheDetailsOfThatCategory() throws ProductException {
		
		assertEquals(2,iProductService.updateProducts("cosmatics",10));
		
	}
	

}

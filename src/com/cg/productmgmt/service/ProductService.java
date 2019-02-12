package com.cg.productmgmt.service;
import java.util.Map;

import com.cg.productmgmt.dao.IProductDAO;
import com.cg.productmgmt.exceptions.ProductException;

public class ProductService implements IProductService {
	
	IProductDAO iProductDAO;	

	public ProductService(IProductDAO iProductDAO) {
		super();
		this.iProductDAO = iProductDAO;
	}


	@Override
	public int updateProducts(String category, int hikePrice) throws ProductException {
		
		int updated=iProductDAO.updateProduct(category, hikePrice);
		
		return updated;
	}


	
	
	@Override
	public Map<String, Integer> getProductDetails() throws ProductException {
		
		Map<String, Integer> productDetails= iProductDAO.getProductDetails();
		
		return productDetails;
	}

}

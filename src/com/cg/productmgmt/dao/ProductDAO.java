package com.cg.productmgmt.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.cg.productmgmt.exceptions.ProductException;

public class ProductDAO implements IProductDAO {
	
	static Map<String, String> productDetails;
	static Map<String, Integer> salesDetails;
	
	static{
		
		productDetails= new HashMap<String, String>();
		productDetails.put("lux","soap");
		productDetails.put("colgate","colgate");
		productDetails.put("pears","soap");
		productDetails.put("sony","electronics");
		productDetails.put("samsung","electronics");
		productDetails.put("facepack","cosmatics");
		productDetails.put("facecream","cosmatics");
		
		salesDetails = new HashMap<String, Integer>();
		salesDetails.put("lux",100);
		salesDetails.put("colgate",50);
		salesDetails.put("pears",70);
		salesDetails.put("sony",10000);
		salesDetails.put("samsung",23000);
		salesDetails.put("facepack",100);
		salesDetails.put("facecream",60);
		
	}
	

	@Override
	public int updateProduct(String catogory, int hikePrice) throws ProductException {
		
		if(productDetails.containsValue(catogory)) {
			
			ArrayList<String> categoryList= new ArrayList<String>();
			Iterator<String> iterator = productDetails.keySet().iterator();
			while(iterator.hasNext()) {
				String key=iterator.next();
				String product = productDetails.get(key);
				if(product.equals(catogory))
					categoryList.add(key);	
			}
			
			for(int i=0;i<categoryList.size();i++) 
				salesDetails.put(categoryList.get(i),salesDetails.get(categoryList.get(i))+hikePrice);
			
			return categoryList.size();
		}
		else {
			
			throw new ProductException();
			
		}
	}

	@Override
	public Map<String, Integer> getProductDetails() throws ProductException {
		
		return salesDetails;
		
	}

}

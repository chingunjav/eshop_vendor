package edu.miu.shop.eshopvendor.service;

import java.util.List;

import edu.miu.shop.eshopvendor.domain.Product;

public interface ProductService {
	
	public String inserProduct(Product product,String vID);

	List<Product> listByVendorID(String vendorID);

}

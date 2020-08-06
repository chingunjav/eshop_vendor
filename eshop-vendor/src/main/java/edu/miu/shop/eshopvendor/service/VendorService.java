package edu.miu.shop.eshopvendor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.shop.eshopvendor.dao.VendorDao;
import edu.miu.shop.eshopvendor.domain.Product;
import edu.miu.shop.eshopvendor.domain.Promotion;
import edu.miu.shop.eshopvendor.domain.Vendor;

public interface VendorService {

	public String insertVendor(Vendor vendor);
	
	public List<Vendor> listVendor();
	
	//public List<Product> listProductbyVendor(String id);
	public String addProduct(String id, Product vProduct);
	
	public void updateVendor(Vendor vendor);	
	public Vendor findById(String id);
	
	//Promotions List
	
	public String addPromotion(String id, String productId, Promotion promotion);

}

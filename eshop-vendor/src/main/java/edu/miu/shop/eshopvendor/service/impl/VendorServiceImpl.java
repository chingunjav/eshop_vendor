package edu.miu.shop.eshopvendor.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.miu.shop.eshopvendor.dao.VendorDao;
import edu.miu.shop.eshopvendor.domain.GeneralMethod;
import edu.miu.shop.eshopvendor.domain.Product;
import edu.miu.shop.eshopvendor.domain.Promotion;
import edu.miu.shop.eshopvendor.domain.Vendor;
import edu.miu.shop.eshopvendor.service.VendorService;

@Service
@Transactional
public class VendorServiceImpl implements VendorService {

	@Autowired
	public VendorDao vendorDao;
	
	@Override
	public Vendor findById(String id)
	{
		return vendorDao.findById(id).orElseThrow();
	}
	
	@Override
	public String insertVendor(Vendor vendor)	{
		vendor.setVendorcode(GeneralMethod.generateOrderNumber(6));
		vendorDao.insert(vendor);
		return vendor.getVendorcode();
		
	}
	
	@Override
	
	public List<Vendor> listVendor(){ 
		 return vendorDao.findAll();
	}
	
//	@Override
//	public List<Product> listProductbyVendor(String id){
//		Vendor obj = vendorDao.findById(id).orElseThrow();
//		return obj.getProducts();
//	}
	
	@Override
	public void updateVendor(Vendor vendor) {
		vendorDao.save(vendor);
	}
	
	//Products
	@Override
	public String addProduct(String id,  Product vProduct ) {
		 Vendor obj = vendorDao.findById(id).orElseThrow();
		 vProduct.setProductID(GeneralMethod.generateOrderNumber(15));
		
		vendorDao.save(obj);
		return vProduct.getProductID();
	}
	
	
	// Promotion implements
	public String addPromotion(String id, String productId, Promotion promotion) {
		Vendor obj = vendorDao.findById(id).orElseThrow();
		promotion.setPromoId(GeneralMethod.generateOrderNumber(10));
		
		/*
		for(Product pp: obj.getProducts())
		{
			if(pp.getProductID().equals(productId))
				tmp =pp;
		}
		*/
	
		vendorDao.save(obj);
		return promotion.getPromoId(); 
	}
}

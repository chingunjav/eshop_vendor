package edu.miu.shop.eshopvendor.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.miu.shop.eshopvendor.dao.ProductDao;
import edu.miu.shop.eshopvendor.dao.impl.ProductDaoImpl;
import edu.miu.shop.eshopvendor.domain.GeneralMethod;
import edu.miu.shop.eshopvendor.domain.Product;
import edu.miu.shop.eshopvendor.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService  {
	@Autowired
	public ProductDao productDao;
	
	@Override
	public String inserProduct(Product product, String vendorId) {
		product.setProductID(GeneralMethod.generateOrderNumber(15));
		productDao.insert(product);
		return product.getProductID();
	}
	
	@Override
	public List<Product> listByVendorID(String vendorID) {
		List<Product> result = productDao.findAll();
		result.stream()
				.filter(p ->p.getVendorid()=="vendorID")
				.map(Product::getVendorid)
				.collect(Collectors.toList());
		return result;
	}
	
}

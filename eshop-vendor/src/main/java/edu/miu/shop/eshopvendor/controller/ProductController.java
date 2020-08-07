package edu.miu.shop.eshopvendor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.miu.shop.eshopvendor.domain.Product;
import edu.miu.shop.eshopvendor.service.ProductService;

@RestController
@RequestMapping("{vid}/product")
public class ProductController {
	
	@Autowired
	ProductService productService;

	@PostMapping("/create")
	public String insertProduct(@PathVariable String vid, @RequestBody Product product) {
		
		product.setIsActice(true);
		product.setIsOnPromotion(false);
		product.setIsDeleted(false);
		return productService.inserProduct(product, vid); 
	}
	
	@GetMapping("/list")
	public List<Product> listProductByVendor(@PathVariable String vid){
		return productService.listByVendorID(vid);
	}
	
	

}

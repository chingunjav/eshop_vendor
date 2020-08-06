package edu.miu.shop.eshopvendor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.el.stream.Optional;

import edu.miu.shop.eshopvendor.domain.Product;
import edu.miu.shop.eshopvendor.domain.Promotion;
import edu.miu.shop.eshopvendor.domain.Vendor;
import edu.miu.shop.eshopvendor.service.VendorService;
import edu.miu.shop.eshopvendor.service.impl.VendorServiceImpl;

@RestController
@RequestMapping("/vendors")
public class VendorController {

	@Autowired
	VendorService vendorService;
	
	@PostMapping("/create")
	public String insertVendor(@RequestBody Vendor vendor) {
		return vendorService.insertVendor(vendor);
	}
	@GetMapping("/list")
	public List<Vendor> listVendor()
	{
		return vendorService.listVendor();
	}
	
	@GetMapping("/{id}")
	public Vendor getVendor(@PathVariable String id) {
		return   vendorService.findById(id);
	}
	
	@PutMapping("/update")
	public void updateVendor( @RequestBody Vendor vendor) {
		vendorService.updateVendor(vendor);
	}
	@PutMapping("/{id}/addproduct")
	public String addProduct(@PathVariable String id, @RequestBody Product vProduct) {
			return vendorService.addProduct(id, vProduct);
	}
	
//	@GetMapping("/{id}/products")
//	public List<Product> listProduct(@PathVariable String id){
//		return vendorService.listProductbyVendor(id);
//	}
	
	@PostMapping("/{id}/{productId}/addpromotion")
	public String addPromotion(@PathVariable String id, @PathVariable String productId,@RequestBody Promotion promotion) {
		return vendorService.addPromotion(id, productId, promotion);
	}
	
}

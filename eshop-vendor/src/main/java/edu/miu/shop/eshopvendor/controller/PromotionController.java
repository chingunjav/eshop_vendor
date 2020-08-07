package edu.miu.shop.eshopvendor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.miu.shop.eshopvendor.domain.Promotion;
import edu.miu.shop.eshopvendor.service.PromotionService;

@RestController
@RequestMapping("/{vid}/promotions")
public class PromotionController {
	@Autowired
	PromotionService promotionservice;
	
	@PostMapping("/create")
	public String insertPromotion(@PathVariable String vid, @RequestBody Promotion promotion) {
		return promotionservice.insertPromotion(promotion,vid);
	}
	
	@GetMapping("/list")
	public List<Promotion> listPromotionByVendor(@PathVariable String vid){
		return promotionservice.listByVendorID(vid);
	}
}

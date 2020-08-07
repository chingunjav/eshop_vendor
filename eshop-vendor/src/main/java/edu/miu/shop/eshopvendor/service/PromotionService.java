package edu.miu.shop.eshopvendor.service;

import java.util.List;


import edu.miu.shop.eshopvendor.domain.Promotion;

public interface PromotionService {
	
	String insertPromotion(Promotion promotion, String vendorId);

	List<Promotion> listByVendorID(String vendorID);
}

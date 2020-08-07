package edu.miu.shop.eshopvendor.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.miu.shop.eshopvendor.dao.PromotionDao;
import edu.miu.shop.eshopvendor.domain.GeneralMethod;
import edu.miu.shop.eshopvendor.domain.Promotion;
import edu.miu.shop.eshopvendor.service.PromotionService;

@Service
@Transactional
public class PromotionServiceImpl implements PromotionService {

	@Autowired
	PromotionDao promotionDao;
	@Override
	public String insertPromotion(Promotion promotion, String vendorId) {
		promotion.setPromoId(GeneralMethod.generateOrderNumber(8));
		promotion.setVendorID(vendorId);
		promotion.setPromoName(promotion.getPromoName());
		promotionDao.insert(promotion);
		return promotion.getPromoName();
	}
	
	
	@Override
	public List<Promotion> listByVendorID(String vendorID) {
		List<Promotion> result = promotionDao.findAll();
		result.stream()
				.filter(p ->p.getVendorID()==vendorID)
				.map(Promotion::getVendorID)
				.collect(Collectors.toList());
		return result;
	}
}

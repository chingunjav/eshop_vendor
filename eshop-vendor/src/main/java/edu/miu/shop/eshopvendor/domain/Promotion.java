package edu.miu.shop.eshopvendor.domain;

import java.time.LocalDate;
//Sale

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@Document(collection ="promotion")
public class Promotion {

	@Id
	String promoId;
	String promoName;
	String desc;
	Long percentage;
	String vendorID;
	String productID;
	LocalDate startDate;
	LocalDate endDate;
	public Promotion() {}
	public Promotion(String promoName, String desc, Long percentage, LocalDate startDate, LocalDate endDate) {
		this.promoName = promoName;
		this.desc = desc;
		this.percentage = percentage;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
}

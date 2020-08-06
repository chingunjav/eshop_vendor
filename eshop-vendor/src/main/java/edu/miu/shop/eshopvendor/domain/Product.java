package edu.miu.shop.eshopvendor.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Document(collection ="product")
public class Product {

	@Id
	
	String productID;
	String productName;
	Double price;
	String desc;
	Boolean isActice;
	Boolean isDeleted;
	String manifacturer;
	int currentQunatity;
	Boolean isAvailable;
	Boolean isOnPromotion;
	String vendorid;
	String promotionid;
	
}

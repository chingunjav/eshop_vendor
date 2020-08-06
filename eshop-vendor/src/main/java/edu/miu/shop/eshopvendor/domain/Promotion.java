package edu.miu.shop.eshopvendor.domain;

import java.time.LocalDate;
//Sale

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class Promotion {

	String promoId;
	String promoName;
	String desc;
	Long percentage;
	LocalDate startDate;
	LocalDate endDate;
	
	
	
}

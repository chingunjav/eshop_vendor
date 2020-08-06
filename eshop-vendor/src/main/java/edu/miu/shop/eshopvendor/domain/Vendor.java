package edu.miu.shop.eshopvendor.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Document(collection="vendors")
public class Vendor extends Person {
	@Id
	private String id;
	private String vendorname;
	private String vendorcode;
	private String desc;
	private String custServContactNo;
	private String status;  //new, active, inactive

	List<Product> products;
	List<Promotion> promotions;

	Vendor(String vendorname, String contactPhone, String email, String password){
		super(email,password,contactPhone,password);
		this.vendorname = vendorname;
		//this.products = new ArrayList<Product>();
		//products.add(new Product("1","Watch",40.00,"comm",true,false,"mani",4,true,false));
		//this.promotions = new ArrayList<Promotion>();
		
	}
/*	
	public void addProduct (Product product) {
		this.products.add(product);
	}
	
	public void addPromotion (Promotion promotion) {
		this.promotions.add(promotion);
	}
*/	
}

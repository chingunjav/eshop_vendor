package edu.miu.shop.eshopvendor.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Person {
	String email;
	String password;
	String contactPhone;
	String photoUrl;
	
}

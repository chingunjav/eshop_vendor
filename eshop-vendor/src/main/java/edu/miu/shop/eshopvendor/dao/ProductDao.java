package edu.miu.shop.eshopvendor.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import edu.miu.shop.eshopvendor.domain.Product;

@Repository
public interface ProductDao extends MongoRepository<Product, String> {

	
}

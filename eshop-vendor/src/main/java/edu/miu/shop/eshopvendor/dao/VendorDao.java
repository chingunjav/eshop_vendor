package edu.miu.shop.eshopvendor.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



import edu.miu.shop.eshopvendor.domain.Vendor;


@Repository
public interface VendorDao extends MongoRepository<Vendor, String> {

	Optional<Vendor> findById(String id);
}

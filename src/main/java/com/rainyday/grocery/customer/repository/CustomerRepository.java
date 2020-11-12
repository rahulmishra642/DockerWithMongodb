package com.rainyday.grocery.customer.repository;

import com.rainyday.grocery.customer.model.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
    CustomerEntity findByEmail(String email);
}

package com.rainyday.grocery.customer.service;

import com.rainyday.grocery.customer.model.CustomerRequest;
import com.rainyday.grocery.customer.model.CustomerResponse;

public interface CustomerService {
    CustomerResponse create(CustomerRequest customer);
    CustomerResponse update(CustomerRequest customer);
    CustomerResponse getCustomer(String customerId);
    void delete(String customerId);
}

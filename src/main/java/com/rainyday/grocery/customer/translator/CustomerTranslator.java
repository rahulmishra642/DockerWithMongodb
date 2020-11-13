package com.rainyday.grocery.customer.translator;

import com.rainyday.grocery.customer.model.CustomerEntity;
import com.rainyday.grocery.customer.model.CustomerRequest;
import com.rainyday.grocery.customer.model.CustomerResponse;
import org.springframework.stereotype.Component;

@Component
public class CustomerTranslator {

    public CustomerEntity translateToCustomerEntity(CustomerRequest customerRequest){
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setAddress(customerRequest.getAddress());
        customerEntity.setAge(customerRequest.getAge());
        customerEntity.setEmail(customerRequest.getEmail());
        customerEntity.setCustomerName(customerRequest.getCustomerName());
        return customerEntity;
    }

    public CustomerResponse translateToCustomerResponse(CustomerEntity customerEntity){
        CustomerResponse customerResponse = new CustomerResponse();
        customerResponse.setAddress(customerEntity.getAddress());
        customerResponse.setAge(customerEntity.getAge());
        customerResponse.setEmail(customerEntity.getEmail());
        customerResponse.setCustomerName(customerEntity.getCustomerName());
        return customerResponse;
    }
}

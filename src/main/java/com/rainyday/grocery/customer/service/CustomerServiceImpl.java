package com.rainyday.grocery.customer.service;

import com.rainyday.grocery.customer.model.CustomerEntity;
import com.rainyday.grocery.customer.model.CustomerRequest;
import com.rainyday.grocery.customer.model.CustomerResponse;
import com.rainyday.grocery.customer.repository.CustomerRepository;
import com.rainyday.grocery.customer.translator.CustomerTranslator;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;
    private CustomerTranslator customerTranslator;

    @Override
    public CustomerResponse create(CustomerRequest customer) {
        CustomerEntity customerEntity = customerRepository.
                save(customerTranslator.translateToCustomerEntity(customer));
        return customerTranslator.translateToCustomerResponse(customerEntity);
    }

    @Override
    public CustomerResponse update(CustomerRequest customer) {
        CustomerEntity customerEntity = customerRepository.findByEmail(customer.getEmail());
        if (Objects.nonNull(customerEntity)){
            CustomerEntity updatedCustomerEntity = customerRepository.
                    save(customerTranslator.translateToCustomerEntity(customer));
            return customerTranslator.translateToCustomerResponse(updatedCustomerEntity);
        }
        else return new CustomerResponse();
    }

    @Override
    public CustomerResponse getCustomer(String customerId) {
        Optional<CustomerEntity> customerEntity = customerRepository.findById(customerId);
        return customerTranslator.translateToCustomerResponse(customerEntity.get());
    }

    @Override
    public void delete(String customerId) {
        customerRepository.deleteById(customerId);
    }
}

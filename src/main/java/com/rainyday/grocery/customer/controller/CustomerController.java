package com.rainyday.grocery.customer.controller;


import com.rainyday.grocery.customer.model.CustomerRequest;
import com.rainyday.grocery.customer.model.CustomerResponse;
import com.rainyday.grocery.customer.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/customer")
@AllArgsConstructor
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<CustomerResponse> createCustomer(@RequestBody CustomerRequest customer){
        CustomerResponse response = customerService.create(customer);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<CustomerResponse> updateCustomerDetails(@RequestBody CustomerRequest customer){
        CustomerResponse response = customerService.update(customer);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerResponse> getCustomerDetails(@PathVariable String customerId){
        CustomerResponse response = customerService.getCustomer(customerId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{customerId}")
    public void deleteCustomer(@PathVariable String customerId){
        customerService.delete(customerId);
    }

}

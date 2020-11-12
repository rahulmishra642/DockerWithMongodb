package com.rainyday.grocery.customer.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerResponse {
    private String id;
    private String customerName;
    private String email;
    private String age;
    private Address address;
}

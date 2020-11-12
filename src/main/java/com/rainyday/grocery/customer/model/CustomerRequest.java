package com.rainyday.grocery.customer.model;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CustomerRequest {
    private String customerName;
    private String email;
    private String age;
    private Address address;

}

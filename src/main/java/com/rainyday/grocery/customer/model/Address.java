package com.rainyday.grocery.customer.model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Address {
    private String addressLine1;
    private String addressLine2;
    private String state;
    private String city;
    private String pinCode;

}

package com.rainyday.grocery.customer.model;

import lombok.Getter;
import lombok.Setter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "Customer")
public class CustomerEntity {
    @Id
    private String id;
    private String customerName;
    private String email;
    private String age;
    private Address address;
}

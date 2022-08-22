package com.mariusmicroservices.services;

import com.mariusmicroservices.model.Customer;
import com.mariusmicroservices.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationCustomerRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        // todo check email validity
        // store customer in db
        customerRepository.save(customer);
    }
}

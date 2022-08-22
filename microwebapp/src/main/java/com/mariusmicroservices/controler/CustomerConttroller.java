package com.mariusmicroservices.controler;

import com.mariusmicroservices.services.CustomerRegistrationCustomerRequest;
import com.mariusmicroservices.services.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/customers")
public record CustomerConttroller(CustomerService customerService) {
    @PostMapping
    public void registerCustomer(@RequestBody CustomerRegistrationCustomerRequest customerRegistrationRequest){
        log.info("new customer registration: {} ", customerRegistrationRequest);
        customerService.registerCustomer(customerRegistrationRequest);
    }
}

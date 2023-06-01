package com.food.ordering.system.customer.service.ports.input.service;

import com.food.ordering.system.customer.service.create.CreateCustomerCommand;
import com.food.ordering.system.customer.service.create.CreateCustomerResponse;

import javax.validation.Valid;

public interface CustomerApplicationService {
    CreateCustomerResponse createCustomer(@Valid CreateCustomerCommand createCustomerCommand);
}

package com.springinaction.pizza.service;

import com.springinaction.pizza.domain.Customer;

/**
 * Created by Hao HOU on 2017/6/12.
 */
public interface CustomerService {
    Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException;
}

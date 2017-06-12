package com.springinaction.pizza.service;

/**
 * Created by Hao HOU on 2017/6/12.
 */

@SuppressWarnings("serial")
public class CustomerNotFoundException extends Exception{
    public CustomerNotFoundException() {}
    public CustomerNotFoundException(String message) {
        super(message);
    }
}

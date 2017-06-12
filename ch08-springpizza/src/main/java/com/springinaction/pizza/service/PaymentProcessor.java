package com.springinaction.pizza.service;

import com.springinaction.pizza.PaymentException;

/**
 * Created by Hao HOU on 2017/6/12.
 */
public class PaymentProcessor {
    public PaymentProcessor() {}

    public void approveCreditCard(String creditCardNumber, String expMonth,
                                  String expYear, float amount) throws PaymentException {
        if (amount > 20.00) {
            throw new PaymentException();
        }
    }
}

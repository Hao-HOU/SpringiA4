package com.springinaction.pizza.domain;

/**
 * Created by Hao HOU on 2017/6/12.
 */
public class CreditCardPayment extends Payment {
    public CreditCardPayment() {}

    private String authorization;
    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public String toString() {
        return "CREDIT: $" + getAmount() + "; AUTH: " + authorization;
    }
}

package com.springinaction.pizza.domain;

import java.io.Serializable;

/**
 * Created by Hao HOU on 2017/6/12.
 */
public abstract class Payment implements Serializable{
    private static final long serialVersionID = 1L;

    private float amount;
    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }
}

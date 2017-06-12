package com.springinaction.pizza.service;

import com.springinaction.pizza.domain.Order;

/**
 * Created by Hao HOU on 2017/6/12.
 */
public interface PricingEngine {
    public float calculateOrderTotal(Order order);
}

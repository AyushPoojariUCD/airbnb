package com.ayushpoojari.airbnb.strategy;

import com.ayushpoojari.airbnb.entity.Inventory;

import java.math.BigDecimal;
public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);
}

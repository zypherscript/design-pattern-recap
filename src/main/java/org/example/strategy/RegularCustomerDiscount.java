package org.example.strategy;

public class RegularCustomerDiscount implements DiscountStrategy {

  @Override
  public double applyDiscount(double originalPrice) {
    return originalPrice;
  }
}

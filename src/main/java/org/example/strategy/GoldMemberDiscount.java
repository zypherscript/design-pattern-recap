package org.example.strategy;

public class GoldMemberDiscount implements DiscountStrategy {

  @Override
  public double applyDiscount(double originalPrice) {
    return originalPrice * 0.90;
  }
}
package org.example.strategy;

public class SilverMemberDiscount implements DiscountStrategy {

  @Override
  public double applyDiscount(double originalPrice) {
    return originalPrice * 0.95;
  }
}
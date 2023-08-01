package org.example.strategy;

public class ShoppingCart {

  private DiscountStrategy discountStrategy;

  public void setDiscountStrategy(DiscountStrategy discountStrategy) {
    this.discountStrategy = discountStrategy;
  }

  public double calculateTotalPrice(double originalPrice) {
    return discountStrategy.applyDiscount(originalPrice);
  }

  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();
    double originalPrice = 100.0;

    DiscountStrategy regularCustomerDiscount = new RegularCustomerDiscount();
    cart.setDiscountStrategy(regularCustomerDiscount);
    double totalPrice = cart.calculateTotalPrice(originalPrice);
    System.out.println("Total price for regular customer: $" + totalPrice);

    DiscountStrategy silverMemberDiscount = new SilverMemberDiscount();
    cart.setDiscountStrategy(silverMemberDiscount);
    totalPrice = cart.calculateTotalPrice(originalPrice);
    System.out.println("Total price for silver member: $" + totalPrice);

    DiscountStrategy goldMemberDiscount = new GoldMemberDiscount();
    cart.setDiscountStrategy(goldMemberDiscount);
    totalPrice = cart.calculateTotalPrice(originalPrice);
    System.out.println("Total price for gold member: $" + totalPrice);
  }
}

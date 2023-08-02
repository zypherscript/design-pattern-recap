package org.example.templatemethod;

public class Client {

  public static void main(String[] args) {
    Beverage coffee = new Coffee();
    Beverage tea = new Tea();

    System.out.println("Preparing coffee:");
    coffee.prepareBeverage();

    System.out.println("\nPreparing tea:");
    tea.prepareBeverage();
  }
}

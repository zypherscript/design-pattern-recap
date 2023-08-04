package org.example.decorator;

public class Main {

  public static void main(String[] args) {
    Coffee espresso = new Espresso();
    espresso = new MilkDecorator(espresso);
    espresso = new CaramelDecorator(espresso);

    System.out.println("Order: " + espresso.getDescription());
    System.out.println("Cost: $" + espresso.getCost());
  }
}

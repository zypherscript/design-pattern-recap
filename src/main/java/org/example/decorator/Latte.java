package org.example.decorator;

public class Latte implements Coffee {

  @Override
  public double getCost() {
    return 2.49;
  }

  @Override
  public String getDescription() {
    return "Latte";
  }
}
package org.example.decorator;

public class CaramelDecorator extends CoffeeDecorator {

  public CaramelDecorator(Coffee decoratedCoffee) {
    super(decoratedCoffee);
  }

  @Override
  public double getCost() {
    return super.getCost() + 0.75;
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", Caramel";
  }
}

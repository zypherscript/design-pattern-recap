package org.example.strategy.factorymethod;

public class SquarePaymentGateway implements PaymentGateway {

  @Override
  public void processPayment(double amount) {
    System.out.println("Processing payment via Square: $" + amount);
  }
}

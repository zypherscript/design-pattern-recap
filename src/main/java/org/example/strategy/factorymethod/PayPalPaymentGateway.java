package org.example.strategy.factorymethod;

public class PayPalPaymentGateway implements PaymentGateway {

  @Override
  public void processPayment(double amount) {
    System.out.println("Processing payment via PayPal: $" + amount);
  }
}

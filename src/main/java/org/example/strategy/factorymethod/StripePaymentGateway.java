package org.example.strategy.factorymethod;

public class StripePaymentGateway implements PaymentGateway {

  @Override
  public void processPayment(double amount) {
    System.out.println("Processing payment via Stripe: $" + amount);
  }
}

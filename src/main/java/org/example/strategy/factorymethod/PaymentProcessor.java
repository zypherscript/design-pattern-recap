package org.example.strategy.factorymethod;

public class PaymentProcessor {

  private PaymentGateway paymentGateway;

  public void setPaymentGateway(PaymentGateway paymentGateway) {
    this.paymentGateway = paymentGateway;
  }

  public void processPayment(double amount) {
    if (paymentGateway == null) {
      throw new IllegalStateException("Payment gateway not set");
    }
    paymentGateway.processPayment(amount);
  }

  public static void main(String[] args) {
    PaymentGatewayFactory factory = new PaymentGatewayFactory();
    PaymentProcessor processor = new PaymentProcessor();

    PaymentGateway paypalGateway = factory.createPaymentGateway("PayPal");
    processor.setPaymentGateway(paypalGateway);
    processor.processPayment(100.0);

    PaymentGateway stripeGateway = factory.createPaymentGateway("Stripe");
    processor.setPaymentGateway(stripeGateway);
    processor.processPayment(50.0);

    PaymentGateway squareGateway = factory.createPaymentGateway("Square");
    processor.setPaymentGateway(squareGateway);
    processor.processPayment(75.0);
  }
}

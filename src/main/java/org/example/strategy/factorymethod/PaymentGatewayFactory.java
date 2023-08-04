package org.example.strategy.factorymethod;

public class PaymentGatewayFactory {

  public PaymentGateway createPaymentGateway(String gatewayType) {
    if ("PayPal".equalsIgnoreCase(gatewayType)) {
      return new PayPalPaymentGateway();
    } else if ("Stripe".equalsIgnoreCase(gatewayType)) {
      return new StripePaymentGateway();
    } else if ("Square".equalsIgnoreCase(gatewayType)) {
      return new SquarePaymentGateway();
    }
    throw new IllegalArgumentException("Invalid gateway type: " + gatewayType);
  }
}

package org.example.templatemethod;

public class Tea extends Beverage {

  @Override
  void brew() {
    System.out.println("Steeping tea...");
  }

  @Override
  void addCondiments() {
    System.out.println("Adding lemon...");
  }
}

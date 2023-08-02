package org.example.templatemethod;

public class Coffee extends Beverage {

  @Override
  void brew() {
    System.out.println("Brewing coffee...");
  }

  @Override
  void addCondiments() {
    System.out.println("Adding sugar and milk...");
  }
}

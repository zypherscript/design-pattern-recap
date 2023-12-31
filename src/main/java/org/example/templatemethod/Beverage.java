package org.example.templatemethod;

public abstract class Beverage {


  final void prepareBeverage() {
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }

  abstract void brew();

  abstract void addCondiments();
  
  void boilWater() {
    System.out.println("Boiling water...");
  }

  void pourInCup() {
    System.out.println("Pouring into cup...");
  }
}

package org.learning.java.AbstractAnimals;

public class Cane extends Animale {
  public Cane(String name) {
    super(name);
  }
  
  @Override
  public void eat() {
    System.out.println("Carne");
  
  }
  
  @Override
  public void verse() {
    System.out.print("Woof");
  }
  
}

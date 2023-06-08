package org.learning.java.AbstractAnimals;

public class Passero extends Animale {
  public Passero(String name) {
    super(name);
  }
  
  @Override
  public void eat() {
    System.out.println("Semi");
  }
  
  @Override
  public void verse() {
    System.out.print("Cip");
  }
}

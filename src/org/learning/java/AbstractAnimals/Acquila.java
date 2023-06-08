package org.learning.java.AbstractAnimals;

public class Acquila extends Animale {
  public Acquila(String name) {
    super(name);
  }
  
  @Override
  public void eat() {
    System.out.println("Carne");
  }
  
  @Override
  public void verse() {
    System.out.print("Yaaaaaaaaaaaaaaaaaaaa");
  }
}

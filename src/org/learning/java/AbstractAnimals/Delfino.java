package org.learning.java.AbstractAnimals;

public class Delfino extends Animale {
  public Delfino(String name) {
    super(name);
  }
  
  @Override
  public void eat() {
    System.out.println("Pesce");
  }
  
  @Override
  public void verse() {
    System.out.print("Yi yi yi");
  }
}

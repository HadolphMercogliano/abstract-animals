package org.learning.java.AbstractAnimals;

public class Passero extends Animale implements CanFly {
  public Passero(String name) {
    super(name);
  }
  
  @Override
  public void eat() {
    System.out.println("Semi");
  }
  
  @Override
  public void verse() {
    System.out.println("Cip");
  }
  
  @Override
  public void fly() {
    System.out.println("Sto volando!");
  
  }
}

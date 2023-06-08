package org.learning.java.AbstractAnimals;

public class Acquila extends Animale implements CanFly {
  public Acquila(String name) {
    super(name);
  }
  
  @Override
  public void eat() {
    System.out.println("Carne");
  }
  
  @Override
  public void verse() {
    System.out.println("Yaaaaaaaaaaaaaaaaaaaa");
  }
  
  @Override
  public void fly() {
    System.out.println("Sto volando!");
  
  }
}

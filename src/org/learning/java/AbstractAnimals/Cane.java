package org.learning.java.AbstractAnimals;

public class Cane extends Animale implements CanSwim {
  public Cane(String name) {
    super(name);
  }
  
  @Override
  public void eat() {
    System.out.println("Carne");
  
  }
  
  @Override
  public void verse() {
    System.out.println("Woof");
  }
  
  @Override
  public void swim() {
    System.out.println("Sto nuotando!");
  }
}

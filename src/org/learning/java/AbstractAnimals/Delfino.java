package org.learning.java.AbstractAnimals;

public class Delfino extends Animale implements CanSwim{
  public Delfino(String name) {
    super(name);
  }
  
  @Override
  public void eat() {
    System.out.println("Pesce");
  }
  
  @Override
  public void verse() {
    System.out.println("Yi yi yi");
  }
  
  @Override
  public void swim() {
    System.out.println("Sto nuotando!");
  
  }
}

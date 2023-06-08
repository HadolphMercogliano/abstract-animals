package org.learning.java.AbstractAnimals;

public abstract class Animale {
  private String name;
  
  public Animale(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  public void sleep() {
    System.out.println("Zzz");
  };
  public abstract void eat();
  public abstract void verse();
  
}

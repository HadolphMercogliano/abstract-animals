package org.learning.java.AbstractAnimals;

public abstract class Animal {
  private String name;
  
  public Animal(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  void sleep() {
    System.out.println("Zzz");
  };
  void eat() {};
  void verse() {};
  
}

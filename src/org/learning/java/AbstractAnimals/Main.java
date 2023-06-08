package org.learning.java.AbstractAnimals;

public class Main {
    public static void makeSwim(CanSwim animal) {
      animal.swim();
    };
    public static void makeFly(CanFly animal) {
      animal.fly();
    }
  public static void main(String[] args) {
    
    
    Animale[] zoo = new Animale[4];
    zoo[0] = new Cane("William");
    zoo[1] = new Passero("Eddy");
    zoo[2] = new Delfino("lucky");
    zoo[3] = new Acquila("Bob");
    
    
    for (Animale animale : zoo) {
      System.out.println("Classe: " + animale.getClass().getSimpleName());
      System.out.println("Nome: " + animale.getName());
      System.out.print("Cibo: ");
      animale.eat();
      System.out.print("Verso: ");
      animale.verse();
      System.out.print("Dorme: ");
      animale.sleep();
      if(animale instanceof CanFly){
        makeFly((CanFly) animale);
      } else if(animale instanceof CanSwim) {
        makeSwim((CanSwim) animale);
      }
      System.out.print("\n");
    }
    
  }
}

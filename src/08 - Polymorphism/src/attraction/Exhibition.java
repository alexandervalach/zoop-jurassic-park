package attraction;

import dinosaur.*;

import java.util.ArrayList;

public class Exhibition {

  protected ArrayList<Herbivore> herbivores;
  protected ArrayList<Carnivore> carnivores;

  public Exhibition () {
    herbivores = new ArrayList<>();
    carnivores = new ArrayList<>();
  }

  public void seeDinos () {
    herbivores.add(new Stegosaur());
    carnivores.add(new Allosaur());
    herbivores.add(new Triceratops());

    Herbivore herbivore = new Stegosaur();
    System.out.println("Polymorphism example");
    herbivore.roar();

    printDinos();

    // dinosaurs.set(1, dinosaurs.get(0));
    /*
    Dinosaur dinosaur0 = new Dinosaur();
    Dinosaur dinosaur1 = new Dinosaur();

    System.out.println(dinosaur0);
    System.out.println(dinosaur1);

    dinosaur1 = dinosaur0;
    System.out.println(dinosaur0);
    System.out.println(dinosaur1);

    dinosaur1.setState(dinosaur0.getState() + " is sleepy");
    System.out.println(dinosaur0.getState());
    System.out.println(dinosaur1.getState());
     */
  }

  public void printDinos () {
    for (Herbivore herbivore : herbivores) {
      System.out.println(herbivore);
    }

    for (Carnivore carnivore : carnivores) {
      System.out.println(carnivore);
    }
  }
}

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
    herbivores.add(new Triceratops());
    carnivores.add(new Allosaur());
    // UPCASTING
    System.out.println("UPCASTING");
    Carnivore carnivore = (Carnivore) new Allosaur();
    Herbivore herbivore1 = new Stegosaur();
    Herbivore herbivore2 = new Triceratops();

    //
    System.out.println(herbivore1.getClass());
    System.out.println(herbivore2.getClass());

    herbivore1.roar();

    printDinos();

    // DOWNCASTING
    Stegosaur stegosaur = (Stegosaur) herbivore1;
    System.out.println("DOWNCASTING");
    System.out.println(stegosaur.getClass());
    stegosaur.roar();

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

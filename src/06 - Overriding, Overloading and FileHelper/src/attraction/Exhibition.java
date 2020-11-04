package attraction;

import dinosaur.Allosaur;
import dinosaur.Stegosaur;

public class Exhibition {

  public void seeDinos () {
    for (int i = 0; i < 5; i++) {
      new Allosaur();
    }

    // System.out.println(Allosaurus.population);

    for (int i = 0; i < 10; i++) {
      Stegosaur stegosaur = new Stegosaur();
    }

    /*
    Allosaurus allosaurus = new Allosaurus();
    Stegosaurus stegosaurus = new Stegosaurus("swinging");
    System.out.println(stegosaurus);
    allosaurus.tryToEat(stegosaurus);

    Stegosaurus youngStegosaurus = new Stegosaurus("swinging");
    allosaurus.tryToEat(youngStegosaurus);
    System.out.println("Easy, girl!");
    youngStegosaurus.setTail("still");
    System.out.println("Stegosaurus happy");
     */
  }

}

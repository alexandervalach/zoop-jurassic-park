package attraction;

import dinosaurs.Allosaurus;
import dinosaurs.Stegosaurus;

public class Exhibition {

  public void seeDinos () {
    Allosaurus allosaurus = new Allosaurus();
    Stegosaurus stegosaurus = new Stegosaurus("swinging");
    System.out.println(stegosaurus);
    allosaurus.tryToEat(stegosaurus);

    Stegosaurus youngStegosaurus = new Stegosaurus("swinging");
    allosaurus.tryToEat(youngStegosaurus);
    System.out.println("Easy, girl!");
    youngStegosaurus.setTail("still");
    System.out.println("Stegosaurus happy");
  }

}

package attraction;

import dinosaurs.Allosaurus;
import dinosaurs.Stegosaurus;

public class Exhibition {

  public void seeDinos () {
    /*
    for (int i = 0; i < 10; i++) {
      new Allosaurus();
    }
    */

    // System.out.println(Allosaurus.population);

    for (int i = 0; i < 15; i++) {
      Stegosaurus stegosaurus = new Stegosaurus();

      if (i < 5) {
        Stegosaurus.state = "hungry";
      } else if (i < 10) {
        Stegosaurus.state = "eating";
      } else if (i < 15) {
        Stegosaurus.state = "sleeping";
      }

      System.out.println(stegosaurus.getState());
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

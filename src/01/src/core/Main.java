package core;

import attraction.Exhibition;
import dinosaurs.Stegosaurus;

public class Main {

  public static void main (String[] args) {
    /*
    System.out.println("Hello, " + args[0] +  " " + args[1] + "!");
    System.out.println("Welcome to Jurassic Park!");
    */
    Exhibition exhibition = new Exhibition();
    exhibition.seeDinos();
  }

  /**
   * Access modifiers
   * public - available from outside
   * private - available within class
   * protected - available within class, available when inheriting
   * package private - by default
   */

}

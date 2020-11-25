package core;

import attraction.Exhibition;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.ExplicitGroup;
import dinosaur.*;
import environment.TropicalStorm;
import people.Human;
import people.TourGuide;
import people.Visitor;
import security.ExplosionExpert;
import security.Leader;
import security.Ranger;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

  public static void main (String[] args) {
    /*
    System.out.println("Hello, " + args[0] +  " " + args[1] + "!");
    System.out.println("Welcome to Jurassic Park!");
    */
    Exhibition exhibition = new Exhibition();
    exhibition.seeDinos();

    ArrayList<Human> people = new ArrayList<>();
    Ranger ranger = new Leader();
    Ranger expert = new ExplosionExpert();

    people.add(new Visitor());
    people.add(new ExplosionExpert());
    people.add(new Leader());
    people.add(new TourGuide());

    System.out.println("Group Leader " + ranger.protect(people));
    System.out.println("Explosion expert " + expert.protect(people));


    /*
    TropicalStorm tropicalStorm = new TropicalStorm(6, 0);

    if (tropicalStorm.rampage(exhibition)) {
      System.out.println("Fence around exhibition has been destroyed");
    } else {
      System.out.println("Everything is ok");
    }
     */

    /*
    for (int i = 0; i < args.length; i++) {
      if (args[i].equals("-v")) {
        System.out.println("Welcome visitor to Jurassic Park!");
      } else if (args[i].equals("-t")) {
        try {
          Integer hours = Integer.parseInt(args[i+1]);
          System.out.println("Thank your for visiting JP for " + args[i + 1] + " h");
        } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Opa, missing value for -t");
          // e.printStackTrace();
        } catch (NumberFormatException e) {
          System.out.println("Opa, -t value should be integer");
        }
      }
    }
    */

    /*
    for (int i = 0; i < args.length; i++) {
      if (args[i].equals("-v")) {
        System.out.println("Welcome visitor to Jurassic Park!");
      } else if (args[i].equals("-t")) {
        try {
          System.out.println("Thank you for spending " + args[i + 1] + " h in Jurassic Park!");
        } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Opa, -t argument value is missing");
          // e.printStackTrace();
        }
      }
    }
    */

    /*
    for (int i = 0; i < args.length; i++) {
      if (args[i].equals("-r")) {
        System.out.println("Execute restart immediately");
      } else if (args[i].equals("-t")) {
        try {
          System.out.println("Execute restart in " + args[i + 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Opa, missing value after -t argument");
          // e.printStackTrace();
        }
      }
    }
     */
  }

  /**
   * Access modifiers
   * public - available from outside
   * private - available within class
   * protected - available within class, available when inheriting
   * package private - by default
   */

}

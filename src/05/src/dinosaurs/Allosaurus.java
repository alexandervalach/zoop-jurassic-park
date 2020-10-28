package dinosaurs;

public class Allosaurus extends Dinosaurus {

  public static Integer population = 0;

  public Allosaurus () {
    population++;
    System.out.println(population + " " + this);
    state = "hungry";
  }

  public void tryToEat (Stegosaurus stegosaurus) {
    if (stegosaurus.getTail().equals("swinging")) {
      System.out.println("Not able to eat another dinosaur");
    } else if (stegosaurus.getTail().equals("still")) {
      System.out.println("Yam, yam. Delicious stegosaurus");
    }
  }

}

package dinosaur;

public class Allosaur extends Dinosaur {

  public static Integer population = 0;

  public Allosaur() {
    population++;
    state = "hungry";
  }

  // UML: Association
  public void tryToEat (Stegosaur stegosaur) {
    if (stegosaur.getTail().equals("swinging")) {
      System.out.println("Not able to eat another dinosaur");
    } else if (stegosaur.getTail().equals("still")) {
      System.out.println("Yam, yam. Delicious stegosaurus");
    }
  }

}

package dinosaurs;

public class Allosaurus {

  public void tryToEat (Stegosaurus stegosaurus) {
    if (stegosaurus.getTail().equals("swinging")) {
      System.out.println("Not able to eat another dinosaur");
    } else if (stegosaurus.getTail().equals("still")) {
      System.out.println("Yam, yam. Delicious stegosaurus");
    }
  }

}

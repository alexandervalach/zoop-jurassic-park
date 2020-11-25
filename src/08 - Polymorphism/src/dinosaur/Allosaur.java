package dinosaur;

public class Allosaur extends Carnivore {

  public Allosaur() {
    super();
  }

  // UML: Association
  public void tryToEat (Stegosaur stegosaur) {
    if (stegosaur.getTail().equals("swinging")) {
      System.out.println("Not able to eat another dinosaur");
    } else if (stegosaur.getTail().equals("still")) {
      System.out.println("Yam, yam. Delicious stegosaurus");
    }
  }

  @Override
  public void roar() {
    System.out.println("I am going to eat you, man");
  }

  @Override
  public boolean eat() {
    return false;
  }

  @Override
  public void fly() {

  }
}

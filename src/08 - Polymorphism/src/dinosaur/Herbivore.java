package dinosaur;

public abstract class Herbivore implements Dinosaur {

  public Herbivore() {

  }

  @Override
  public void fly() {
    System.out.println("I cannot fly :(");
  }

}

package dinosaur;

public class Triceratops extends Herbivore {
  @Override
  public void roar() {
    System.out.println("Vua, I have three horns");
  }

  @Override
  public boolean eat() {
    return false;
  }
}

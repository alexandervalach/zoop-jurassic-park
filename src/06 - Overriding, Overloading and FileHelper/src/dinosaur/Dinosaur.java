package dinosaur;

public class Dinosaur {
  protected static int limbs = 4;
  protected boolean tail = true;
  public static String state = "born";
  private double speed;

  public Dinosaur() {
    roar();
  }

  // OOP: Method will be overridden in child class Stegosaur
  public void roar () {
    System.out.println("Roar! I am going to eat you, man");
  }

  public String getState () {
    return state;
  }

  public void setState (String state) {
    state = state;
  }

  public double getSpeed () {
    return speed;
  }

  public void setSpeed (double speed) {
    this.speed = speed;
  }
}

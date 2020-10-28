package dinosaurs;

public class Dinosaurus {
  protected static int limbs = 4;
  protected boolean tail = true;
  public static String state = "born";

  public Dinosaurus () {
    // roar();
  }

  public void roar () {
    System.out.println("Roar!");
  }

  public String getState () {
    return state;
  }

  public void setState (String state) {
    state = state;
  }
}

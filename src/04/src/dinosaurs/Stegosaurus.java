package dinosaurs;

public class Stegosaurus extends Dinosaurus {
  private String tail; // instance variable
  private static String brain; // static variable
  private int children;
  private static boolean planteater;

  public Stegosaurus (String tail) {
    this.tail = tail;
  }

  public Stegosaurus (int children) {
    this.children = children;
  }

  public Stegosaurus () {
    this.tail = "still";
  }

  /**
   * Getter for tail state attribute
   * @return
   */
  public String getTail () {
    return this.tail;
  }

  public void setTail (String tail) {
    this.tail = tail;
  }

}

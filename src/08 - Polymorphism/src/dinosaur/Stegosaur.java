package dinosaur;

public class Stegosaur extends Herbivore {
  private String tail; // instance variable
  private int children;
  private static boolean planteater;

  public Stegosaur(String tail) {
    this.tail = tail;
  }

  public Stegosaur(int children) {
    this.children = children;
  }

  public Stegosaur() {
    super();
    this.tail = "still";
  }

  /** Method overriding */
  @Override
  public void roar () {
    System.out.println("Roar! I love plants");
  }

  @Override
  public boolean eat() {
    return false;
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

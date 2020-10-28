package attraction;

import people.Visitor;

public class Attraction {
  protected double price;
  protected int capacity;

  public double visit (Visitor[] visitors) {
    return 10;
  }
}

package people;

import core.Point;

public class Visitor implements Human {
  private double money;

  public void eat (String meal) {
    // empty body
  }

  @Override
  public boolean hide(Point point) {
    // return !(point.getX() > 10 || point.getY() > 10);
    return false;
  }

  @Override
  public String getName() {
    return "Anonym";
  }
}

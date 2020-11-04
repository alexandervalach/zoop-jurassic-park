package environment;

import attraction.Exhibition;
import dinosaur.Dinosaur;

import java.sql.Time;

public class TropicalStorm {
  private int strength; // 0 - weakest, 10 - strongest
  private Time duration;
  private double speed; // in km/h

  // OOP: Constructor overloading
  public TropicalStorm () {

  }

  // OOP: Constructor overloading
  public TropicalStorm (int strength, double speed) {
    this.strength = strength;
    this.speed = speed;
  }

  // OOP: Overloaded method
  public boolean rampage (Dinosaur[] dinosaurs) {
    for (Dinosaur dinosaur : dinosaurs) {
      if (this.speed > dinosaur.getSpeed()) {
        return true;
      }
    }
    return false;
  }

  // OOP: Overloaded method
  public boolean rampage (Exhibition exhibition) {
    return this.strength > 5;
  }

  // OOP: Getter
  public int getStrength() {
    return strength;
  }

  // OOP: Setter
  public void setStrength(int strength) {
    this.strength = strength;
  }

  public Time getDuration() {
    return duration;
  }

  public void setDuration(Time duration) {
    this.duration = duration;
  }

  public double getSpeed() {
    return speed;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
  }

}

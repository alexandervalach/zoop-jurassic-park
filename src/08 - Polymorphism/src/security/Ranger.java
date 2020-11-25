package security;

import people.Employee;
import people.Human;

import java.util.ArrayList;

public abstract class Ranger implements Employee {

    public abstract boolean protect(ArrayList<Human> people);

    public String getName() {
        return "Walker Texas Ranger";
    }

}

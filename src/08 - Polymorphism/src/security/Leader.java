package security;

import core.Point;
import people.Human;
import people.Visitor;

import java.util.ArrayList;

public class Leader extends Ranger {

    @Override
    public boolean protect(ArrayList<Human> people) {
        boolean successfullyHidden;

        for (Human human : people) {
            System.out.println("Hello, my name is " + human.getName());
            human.hide(new Point(5, 5));
        }

        return true;
    }

    @Override
    public boolean serve(Visitor visitor) {
        return false;
    }

    @Override
    public boolean hide(Point point) {
        return false;
    }
}

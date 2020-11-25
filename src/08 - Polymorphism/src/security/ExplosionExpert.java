package security;

import core.Point;
import people.Human;
import people.Visitor;

import java.util.ArrayList;

public class ExplosionExpert extends Ranger {
    @Override
    public boolean protect(ArrayList<Human> people) {
        return false;
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

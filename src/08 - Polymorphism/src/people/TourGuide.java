package people;

import core.Point;

public class TourGuide implements Employee {
    @Override
    public boolean serve(Visitor visitor) {
        return true;
    }

    @Override
    public boolean hide(Point point) {
        return true;
    }

    @Override
    public String getName() {
        return "Veronika";
    }
}

package people;

public interface Employee extends Human {
    boolean serve(Visitor visitor);
}

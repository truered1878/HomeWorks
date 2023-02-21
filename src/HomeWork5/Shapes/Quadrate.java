package HomeWork5.Shapes;

public class Quadrate implements Shape {

    private final double side;

    public Quadrate(double side) {
        this.side = side;
    }

    @Override
    public double getSquare() {
        return side * side;
    }

}

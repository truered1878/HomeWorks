package HomeWork5.Shapes;

public class Triangle implements Shape {

    private final double side;
    private final double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double getSquare() {
        return 0.5 * side * height;
    }

}

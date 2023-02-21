package HomeWork5.Shapes;

public class Circle implements Shape {

    private final double pi = 3.14;
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return radius * radius * pi;
    }

}

package HomeWork5.Shapes;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Shape[] shapeArray = new Shape[3];
        shapeArray[0] = new Triangle(3,4);
        shapeArray[1] = new Circle(4);
        shapeArray[2] = new Quadrate(4);

        System.out.println("Shape square: " + shapeArray[0].getSquare());
        System.out.println("------------------------------------");
        System.out.println("Shape square: " + shapeArray[1].getSquare());
        System.out.println("------------------------------------");
        System.out.println("Shape square: " + shapeArray[2].getSquare());
        System.out.println("------------------------------------");

        double sum = shapeArray[0].getSquare() + shapeArray[1].getSquare() + shapeArray[2].getSquare();
        System.out.println("Total square of all shapes: " + sum);
    }
}
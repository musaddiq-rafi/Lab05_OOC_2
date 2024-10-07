package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(0,0,10);
        Shape rectangle = new Rectangle(0, 0, 33,22);
        Shape square = new Square (0,0,10);

        List<Shape> shapes = Arrays.asList(circle,rectangle,square);

        OrderPrinter.printOrderShapes(shapes);
    }
}

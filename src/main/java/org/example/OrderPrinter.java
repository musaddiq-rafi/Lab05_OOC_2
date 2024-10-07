package org.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderPrinter {
    public static void printOrderShapes(List<Shape> shapes){
        ShapeSorter sorter = new ShapeSorter();
        shapes = sorter.printOrderShapes(shapes);
        for (Shape shape: shapes){
            System.out.println(shape.getClass().getSimpleName()+"-Area: "+shape.area()+" X coordinate:"+shape.getX()+" Y coordinate:"+shape.getY());
        }
    }


}

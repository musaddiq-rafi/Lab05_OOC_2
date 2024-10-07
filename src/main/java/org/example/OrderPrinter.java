package org.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderPrinter {
    public static void printOrderShapes(List<Shape> shapes){
        Collections.sort(shapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                //compare by area
                int areaCompare = Double.compare(o1.area(),o2.area());
                if (areaCompare!=0){
                    return areaCompare;
                }
                int xCompare = Double.compare(o1.getX(),o2.getX());
                if (xCompare!=0){
                    return xCompare;
                }
                return Double.compare(o1.getY(),o2.getY());

                }

            });
            for (Shape shape: shapes){
                System.out.println(shape.getClass().getSimpleName()+"-Area: "+shape.area()+" X coordinate:"+shape.getX()+" Y coordinate:"+shape.getY());

        }
    }


}

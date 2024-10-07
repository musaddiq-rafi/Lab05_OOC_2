package org.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShapeSorter {
    public static List<Shape> printOrderShapes(List<Shape> shapes){
        Collections.sort(shapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
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
        return shapes;

    }
}

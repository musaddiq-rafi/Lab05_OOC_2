package org.example;

public class ShapeFactory {
    public static Shape createShape(String shapeType, double x, double y, double ... parameters){
        if (shapeType.equalsIgnoreCase("circle")){
            return new Circle(x,y,parameters[0]);
        }
        else if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle(x,y,parameters[0],parameters[1]);
        }
        else if(shapeType.equalsIgnoreCase(("square"))){
            return new Square(x,y,parameters[0]);
        }

        return null;
    }
}


package org.example;

public class Circle extends Shape{
    private double radius;
    public Circle (double x, double y, double radius){
        super(x,y);
        this.radius=radius;
    }
    public double area(){
        return 3.14*radius*radius;
    }
}

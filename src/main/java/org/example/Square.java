package org.example;

public class Square extends Shape{
    private double side;
    public Square (double x, double y, double side){
        super(x,y);
        this.side=side;
    }
    public double area(){
        return side*side;
    }
}

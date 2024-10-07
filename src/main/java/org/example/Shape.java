package org.example;

abstract class Shape {
    private double x;
    private double y;
    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public abstract double area();


    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

}

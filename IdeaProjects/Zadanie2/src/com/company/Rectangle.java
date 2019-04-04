package com.company;
//Łukasz Rachwał s19638

public class Rectangle {

    private double side1;
    private double side2;

    public Rectangle(double side1, double side2)
    {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1()
    {
        return side1;
    }

    public double getSide2()
    {
        return side2;
    }

    public double getArea()
    {
        return side1 * side2;
    }

    public double getPerimeter()
    {
     return 2 * side1 + 2 * side2
    }

    public double getDiagonal()
    {
        return Math.sqrt(side1 * side1 + side2 * side2);
    }

}

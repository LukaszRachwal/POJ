package com.company;

// Lukasz Rachwal s19638
// Maciej Rybacki S18553

public class MyRectangle {

    private MyPoint topLeftCorner;
    private MyPoint bottomRightCorner;

    public MyTriangle(int x1, int y1, int x2, int y2) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint v1, MyPoint v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    @Override
    public String toString() {
        return "MyRectangle[topLeftCorner=" + v1.toString() + ",bottomRightCorner" + v2.toString() + "]";
    }

    public double getPerimeter() {
        double x = v1.distance();
        double y = v2.distance();

        return (2*(x + y));
    }

    public double getArea() {
        double x = v1.distance();
        double y = v2.distance();

        return x * y;
    }
}

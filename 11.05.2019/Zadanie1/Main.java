package com.company;

// Lukasz Rachwal S19638
// Maciej Rybacki S18553

public class Main {

    public static void main(String[] args)
    {
        MyPoint p1 = new MyPoint(2, 3);
        System.out.println(p1.distance(4, 5));
        MyPoint p2 = new MyPoint(4, 5);
        MyPoint p3 = new MyPoint(4, 5);
        System.out.println(p2.distance(p3));
        System.out.println(p1.distance());
    }
}

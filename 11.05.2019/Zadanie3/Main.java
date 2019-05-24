package com.company;

// Lukasz Rachwal s19638
// Maciej Rybacki S18553
public class Main {

    public static void main(String[] args) {
        MyTriangle circle = new MyTriangle(2, 5, 7, 4, 3, 3);

        System.out.println(circle.getPerimeter());
        System.out.println(circle.getType());
    }
}

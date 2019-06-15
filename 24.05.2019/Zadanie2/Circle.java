// Praca w parach: Damian Brzoskowski s18499, Łukasz Rachwał s19638

package Zadanie_02;

public class Circle implements GeometricObject {

    protected double radius = 1.0;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return String.format("Zadanie_02.Circle with radius = %1$f", radius);
    }

}
// Praca w parach: Damian Brzoskowski s18499, Łukasz Rachwał s19638

package Zadanie_02;

public class TestForCircles {
    public static void main(String[] args) {
        GeometricObject geoObj1 = new Circle(3.0);
        System.out.println(geoObj1);
        System.out.println("getPerimeter = " + geoObj1.getPerimeter());
        System.out.println("getArea = " + geoObj1.getArea());

        Resizable ResizableObj = new ResizableCircle(2.0);
        System.out.println(ResizableObj);

        ResizableObj.resize(10);
        System.out.println(ResizableObj);

        GeometricObject geoObj2 = (GeometricObject) ResizableObj;
        System.out.println(geoObj2);
        System.out.println("getPerimeter = " + geoObj2.getPerimeter());
        System.out.println("getArea = " + geoObj2.getArea());
    }
}

// Praca w parach: Damian Brzoskowski s18499, Łukasz Rachwał s19638

package Zadanie_02;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius *= percent/100.0;
    }
}
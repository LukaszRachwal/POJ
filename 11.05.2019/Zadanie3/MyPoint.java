package com.company;
// Lukasz Rachwal s19638
// Maciej Rybacki S18553
public class MyPoint
{
    private int x = 0;
    private int y = 0;


    public MyPoint() {

    }

    public MyPoint(
            int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        int[] values = {this.x, this.y};
        return values;
    }

    public String toString()
    {
        return "(" + this.x + ", " + this.y + ")";
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow((x-this.x), 2) + Math.pow((y-this.y), 2));
    }

    public double distance(MyPoint o) {
        return Math.sqrt(Math.pow((o.x-this.x), 2) + Math.pow((o.y-this.y), 2));
    }

    public double distance() {
        return Math.sqrt(Math.pow((0-this.x), 2) + Math.pow((0-this.y), 2));
    }
}

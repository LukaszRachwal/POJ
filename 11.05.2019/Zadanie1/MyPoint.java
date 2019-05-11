package com.company;


public class MyPoint
{
    private int x = 0;
    private int y = 0;

    public MyPoint()
    {

    }
    public MyPoint(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    public int getX()
    {
        return x;
    }
    public void setX(int x)
    {
        this.x=x;
    }
    public int getY()
    {
        return y;
    }
    public void setY(int y)
    {
        this.y=y;
    }
    public int[] getXY()
    {
        int[] getXY = {this.x, this.y};
        return getXY;
    }
    public void setXY(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    public String toString()
    {
        return "(" + this.x + "," + this.y + ")";
    }
    public double distance(int x, int y)
    {

    }
    public double distance()
    {

    }
    public double distance()
    {

    }
}



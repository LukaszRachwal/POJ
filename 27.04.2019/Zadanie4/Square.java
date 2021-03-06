package com.company;

// Lukasz Rachwal s19638

public class Square extends Rectangle
{
    public Square()
    {
    }

    public Square(double side)
    {
        super(side);
    }

    public Square(String color, boolean filled, double side)
    {
        super(color, filled, side);
    }

    public double getSide()
    {
        return this.getWidth();
    }

    public void setSide(double side)
    {
        this.setWidth(side);
        this.setLength(side);
    }

    @Override
    public void setWidth(double side)
    {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side)
    {
        super.setLength(side);
        super.setWidth(side);
    }
}

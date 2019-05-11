package com.company;

public class MyTriangle
{
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3)
    {
        this.x1=x1;
        this.y1=y2;
        this.x2=x2;
        this.y2=y2;
        this.x3=x3;
        this.y3=y3;
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3)
    {
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
    }
    public String toString()
    {
        return "MyTriangle[" + this.v1 + "=" + "(" + this.x1 + "," + this.y1 + ")" + "," + this.v2 + "=" + "(" + this.x2 + "," + this.y2 + ")" + "," + this.v3 + "=" + "(" + this.x3 + "," + this.y3 + ")" "]";
    }
    public double getPerimeter()
    {
        return MyPoint.distance;
    }
    public String getType()
    {

    }
    public boolean getIsExuilateral()
    {
        if(sideA==sideB && sideB==sideC && sideA==sideC )
            return true;
    }

    public boolean getIsIsosceles()
    {
        if(sideA==sideB || sideB==sideC || sideA==sideC)
            return true;
    }

    public boolean getisScalene()
    {
        if(sideA!=sideB && sideB!=sideC && sideA!=sideC)
            return true;
    }
}

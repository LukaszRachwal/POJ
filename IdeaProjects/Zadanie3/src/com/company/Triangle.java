package com.company;
//Łukasz Rachwał s19638
public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC)
    {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double getArea()
    {
        double parameter = (sideA+sideB+sideC)/2;
        return Math.sqrt(parameter*(parameter-sideA)*(parameter-sideB)*(parameter-sideC));
    }

    public double getPerimeter()
    {
        return sideA+sideB+sideC;
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

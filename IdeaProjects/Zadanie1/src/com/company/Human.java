package com.company;
//Łukasz Rachwał s19638

public class Human {
    public int age;
    public double weight;
    public double height;
    public String name;
    public boolean isMale;
    public double feetSize;
    public int indexNumber;
}

public Human(int age, double weight, double height, String name, boolean isMale, double feetSize, int indexNumber)
{
    this.age = age;
    this.weight = weight;
    this.height = height;
    this.name = name;
    this.isMale = isMale;
    this.feetSize = feetSize;
    this.indexNumber = indexNumber;
}

public int getAge()
{
    return age;
}

public double getWeight()
{
    return weight;
}

public double getHeight()
{
    return height;
}

public String getName()
{
    return name;
}

public boolean isMale()
{
    return isMale;
}

public double getFeetSize()
{
    return feetSize;
}

public int getIndexNumber()
{
    return indexNumber;
}

public int setAge(int age)
{
    this.age = age;
}

public double setWeight(double weight)
{
    this.weight = weight;
}

public double setHeight(double height)
{
    this.height = height;
}

public String setName(String name)
{
    this.name = name;
}

public boolean setisMale(boolean isMale)
{
    this.isMale = isMale;
}

 public double setFeetSize(double feetSize)
 {
     this.feetSize = feetSize;
 }

 public int setIndexNumber(int indexNumber)
 {
     this.indexNumber = indexNumber;
 }

package com.company;

// Lukasz Rachwal s19638

public class Point3D extends Point2D
{
    private float z = 0.0f;

    public Point3D(float x, float y, float z)
    {
        super(x, y);
        this.z = z;
    }

    public Point3D()
    {

    }

    public float getZ()
    {
        return z;
    }

    public void setZ(float z)
    {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z)
    {
        this.setX(x);
        this.setY(y);
        this.z = z;
    }

    public float[] getXYZ()
    {
        float[] points = {this.getX(), this.getY(), this.getZ()};
        return points;
    }

    @Override
    public String toString()
    {
        return "(" + this.x + "," + this.y + "," + this.z + ")";
    }
}

package com.company;

// Lukasz Rachwal s19638

public class MovablePoint extends Point
{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;


    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed)
    {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint()
    {

    }

    public float getXSpeed()
    {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed)
    {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed()
    {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed)
    {
        this.ySpeed = ySpeed;
    }

    public float getSpeed()
    {
        return Float.parseFloat(getXSpeed() + " " + getYSpeed());
    }

    public void setSpeed(float xSpeed, float ySpeed)
    {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint move()
    {

        setX(xSpeed);
        setY(ySpeed);

        return this;
    }
}

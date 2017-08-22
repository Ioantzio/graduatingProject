package com.ioantzio.portals.miscellaneous;

public class Point
{
    private int width;
    private int height;

    public Point()
    {
        this.width = 0;
        this.height = 0;
    }

    public Point(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public void setDimensions(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }
}
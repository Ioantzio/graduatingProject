package com.ioantzio.portals.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PointTest
{
    private Point point;

    private int index;
    private int width;
    private int height;

    private int newIndex;
    private int newWidth;
    private int newHeight;

    @Before
    public void initializeVariables()
    {
        index = 5;
        width = 10;
        height = 10;

        newIndex = 10;
        newWidth = 20;
        newHeight = 20;
    }

    @Test
    public void constructorNoParameters()
    {
        point = new Point();
        assertEquals(1, point.getIndex());
        assertEquals(0, point.getWidth());
        assertEquals(0, point.getHeight());
    }

    @Test
    public void constructorWithTwoParameters()
    {
        point = new Point(width, height);
        assertEquals(1, point.getIndex());
        assertEquals(width, point.getWidth());
        assertEquals(height, point.getHeight());
    }

    @Test
    public void constructorWithThreeParameters()
    {
        point = new Point(index, width, height);
        assertEquals(index, point.getIndex());
        assertEquals(width, point.getWidth());
        assertEquals(height, point.getHeight());
    }

    @Before
    public void initializeVariables2()
    {
        point = new Point(index, width, height);
    }

    @Test
    public void setDimensions()
    {
        point.setDimensions(width, height);
        assertEquals(width, point.getWidth());
        assertEquals(height, point.getHeight());
    }

    @Test
    public void getIndex()
    {
        assertEquals(index, point.getIndex());
    }

    @Test
    public void setIndex()
    {
        point.setIndex(newIndex);
        assertEquals(newIndex, point.getIndex());
    }

    @Test
    public void getWidth()
    {
        assertEquals(width, point.getWidth());
    }

    @Test
    public void setWidth()
    {
        point.setWidth(newWidth);
        assertEquals(newWidth, point.getWidth());
    }

    @Test
    public void getHeight()
    {
        assertEquals(height, point.getHeight());
    }

    @Test
    public void setHeight()
    {
        point.setHeight(newHeight);
        assertEquals(newHeight, point.getHeight());
    }

    @After
    public void nullifyVariables()
    {
        point = null;

        index = 0;
        width = 0;
        height = 0;

        newIndex = 0;
        newWidth = 0;
        newHeight = 0;
    }
}
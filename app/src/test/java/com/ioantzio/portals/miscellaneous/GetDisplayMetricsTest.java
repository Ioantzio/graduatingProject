package com.ioantzio.portals.miscellaneous;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class GetDisplayMetricsTest
{
    GetDisplayMetrics getDisplayMetrics;

    private int widthTilesCount;
    private int heightTilesCount;
    private int newWidthTilesCount;
    private int newHeightTilesCount;

    private int tileWidth;
    private int tileHeight;
    private int newTileWidth;
    private int newTileHeight;

    private int offsetX;
    private int offsetY;
    private int newOffsetX;
    private int newOffsetY;

    @Before
    public void initializeVariables()
    {
        widthTilesCount = 2;
        heightTilesCount = 2;
        newWidthTilesCount = 4;
        newHeightTilesCount = 4;

        tileWidth = 50;
        tileHeight = 50;
        newTileWidth = 20;
        newTileHeight = 20;

        offsetX = 2;
        offsetY = 2;
        newOffsetX = 3;
        newOffsetY = 3;
    }

    @Test
    public void GetDisplayMetrics()
    {
        getDisplayMetrics = new GetDisplayMetrics(widthTilesCount, heightTilesCount);
        assertEquals(widthTilesCount, getDisplayMetrics.getWidthTilesCount());
        assertEquals(heightTilesCount, getDisplayMetrics.getHeightTilesCount());
    }

    @Before
    public void initializeVariables2()
    {
        getDisplayMetrics = new GetDisplayMetrics(widthTilesCount, heightTilesCount);
    }
    @Test
    public void getWidthTilesCount()
    {
        assertEquals(widthTilesCount, getDisplayMetrics.getWidthTilesCount());
    }

    @Test
    public void setWidthTilesCount()
    {
        getDisplayMetrics.setWidthTilesCount(newWidthTilesCount);
        assertEquals(newWidthTilesCount, getDisplayMetrics.getWidthTilesCount());
    }

    @Test
    public void getHeightTilesCount()
    {
        assertEquals(heightTilesCount, getDisplayMetrics.getHeightTilesCount());
    }

    @Test
    public void setHeightTilesCount()
    {
        getDisplayMetrics.setHeightTilesCount(newHeightTilesCount);
        assertEquals(newHeightTilesCount, getDisplayMetrics.getHeightTilesCount());
    }

    @Test
    public void getTileWidth()
    {
        assertEquals(tileWidth, getDisplayMetrics.getTileWidth());
    }

    @Test
    public void setTileWidth()
    {
        getDisplayMetrics.setTileWidth(newTileWidth);
        assertEquals(newTileWidth, getDisplayMetrics.getTileWidth());
    }

    @Test
    public void getTileHeight()
    {
        assertEquals(tileHeight, getDisplayMetrics.getTileHeight());
    }

    @Test
    public void setTileHeight()
    {
        getDisplayMetrics.setTileHeight(newTileHeight);
        assertEquals(newTileHeight, getDisplayMetrics.getTileHeight());
    }

    @Test
    public void getOffsetX()
    {
        assertEquals(offsetX, getDisplayMetrics.getOffsetX());
    }

    @Test
    public void setOffsetX()
    {
        getDisplayMetrics.setOffsetX(newOffsetX);
        assertEquals(newOffsetX, getDisplayMetrics.getOffsetX());
    }

    @Test
    public void getOffsetY()
    {
        assertEquals(offsetY, getDisplayMetrics.getOffsetY());
    }

    @Test
    public void setOffsetY()
    {
        getDisplayMetrics.setOffsetY(newOffsetY);
        assertEquals(newOffsetY, getDisplayMetrics.getOffsetY());
    }

    @After
    public void nullifyVariables()
    {
        widthTilesCount = 0;
        heightTilesCount = 0;
        newWidthTilesCount = 0;
        newHeightTilesCount = 0;

        tileWidth = 0;
        tileHeight = 0;
        newTileWidth = 0;
        newTileHeight = 0;

        offsetX = 0;
        offsetY = 0;
        newOffsetX = 0;
        newOffsetY = 0;
    }
}
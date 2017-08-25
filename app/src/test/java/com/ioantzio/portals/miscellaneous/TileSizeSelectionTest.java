package com.ioantzio.portals.miscellaneous;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TileSizeSelectionTest
{
    private TileSizeSelection tileSizeSelection;
    private String[] tileSizes;

    private int widthTilesCount;
    private int heightTilesCount;

    private int newWidthTilesCount;
    private int newHeightTilesCount;

    @Before
    public void initializeVariables()
    {
        widthTilesCount = 5;
        heightTilesCount = 5;

        newWidthTilesCount = 10;
        newHeightTilesCount = 10;
    }

    @Test
    public void TileSizeSelection()
    {
        tileSizeSelection = new TileSizeSelection(widthTilesCount, heightTilesCount);
        assertEquals(widthTilesCount, tileSizeSelection.getWidthTilesCount());
        assertEquals(heightTilesCount, tileSizeSelection.getHeightTilesCount());
    }

    @Before
    public void initializeVariables2()
    {
        tileSizeSelection = new TileSizeSelection(widthTilesCount, heightTilesCount);
    }

    @Test
    public void getWidthTilesCount()
    {
        assertEquals(widthTilesCount, tileSizeSelection.getWidthTilesCount());
    }

    @Test
    public void setWidthTilesCount()
    {
        tileSizeSelection.setWidthTilesCount(newWidthTilesCount);
        assertEquals(newWidthTilesCount, tileSizeSelection.getWidthTilesCount());
    }

    @Test
    public void getHeightTilesCount()
    {
        assertEquals(heightTilesCount, tileSizeSelection.getHeightTilesCount());
    }

    @Test
    public void setHeightTilesCount()
    {
        tileSizeSelection.setHeightTilesCount(newHeightTilesCount);
        assertEquals(newHeightTilesCount, tileSizeSelection.getHeightTilesCount());
    }

    @Before
    public void initializeVariables3()
    {
        tileSizeSelection = new TileSizeSelection(widthTilesCount, heightTilesCount);

        tileSizes = new String[9];

        tileSizes[0] = "tile_xx_small";
        tileSizes[1] = "tile_x_small";
        tileSizes[2] = "tile_small";
        tileSizes[3] = "tile_medium_small";
        tileSizes[4] = "tile_medium";
        tileSizes[5] = "tile_medium_large";
        tileSizes[6] = "tile_large";
        tileSizes[7] = "tile_x_large";
        tileSizes[8] = "tile_xx_large";
    }

    @Test
    public void getTileSize()
    {
        for(int i=1; i<=9; i++)
        {
            assertEquals(tileSizes[i-1], tileSizeSelection.getTileSize(i*50+2, i*50+2));
        }
    }

    @After
    public void nullifyVariables()
    {
        tileSizeSelection = null;
        tileSizes = null;

        widthTilesCount = 0;
        heightTilesCount = 0;

        newWidthTilesCount = 0;
        newHeightTilesCount = 0;
    }
}
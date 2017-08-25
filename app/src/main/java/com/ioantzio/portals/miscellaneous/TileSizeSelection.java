package com.ioantzio.portals.miscellaneous;

public class TileSizeSelection
{

    private int widthTilesCount;
    private int heightTilesCount;

    public TileSizeSelection(int widthTilesCount, int heightTilesCount)
    {
        this.widthTilesCount = widthTilesCount;
        this.heightTilesCount = heightTilesCount;
    }

    public int getWidthTilesCount()
    {
        return widthTilesCount;
    }

    public void setWidthTilesCount(int widthTilesCount)
    {
        this.widthTilesCount = widthTilesCount;
    }

    public int getHeightTilesCount()
    {
        return heightTilesCount;
    }

    public void setHeightTilesCount(int heightTilesCount)
    {
        this.heightTilesCount = heightTilesCount;
    }

    /**
     * @param screenWidth The horizontal size of the screen in pixels
     * @param screenHeight The vertical size of the screen in pixels
     * @return Returns the suggested size of the tile based on the screen width & height
     */
    @SuppressWarnings("RedundantCast")
    public String getTileSize(int screenWidth, int screenHeight)
    {
        int width;
        int height;

        width = (int) (screenWidth / getWidthTilesCount());
        height = (int) (screenHeight / getHeightTilesCount());

        if(width >= 90 || height >= 90)
        {
            return "tile_xx_large";
        }
        else if (width >= 80 || height >= 80)
        {
            return "tile_x_large";
        }
        else if (width >= 70 || height >= 70)
        {
            return "tile_large";
        }
        else if (width >= 60 || height >= 60)
        {
            return "tile_medium_large";
        }
        else if (width >= 50 || height >= 50)
        {
            return "tile_medium";
        }
        else if (width >= 40 || height >= 40)
        {
            return "tile_medium_small";
        }
        else if (width >= 30 || height >= 30)
        {
            return "tile_small";
        }
        else if (width >= 20 || height >= 20)
        {
            return "tile_x_small";
        }
        else if (width >= 10 || height >= 10)
        {
            return "tile_xx_small";
        }
        else
        {
            return "tile_medium";
        }
    }
}
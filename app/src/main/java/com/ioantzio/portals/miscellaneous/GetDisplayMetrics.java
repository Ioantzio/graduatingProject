package com.ioantzio.portals.miscellaneous;

import android.content.res.Resources;

import com.ioantzio.portals.models.Point;

public class GetDisplayMetrics
{
    //widthTilesCount/heightTilesCount: the number of tiles to be drawn horizontally/vertically
    private int widthTilesCount;
    private int heightTilesCount;

    //tileWidth/tileHeight: the calculated width/height of the tile that will be drawn
    private int tileWidth;
    private int tileHeight;

    //offsetX/offsetY: the calculated space from the edge screen to the first tile(s)
    private int offsetX;
    private int offsetY;


    /**
     * @param widthTilesCount Number of tiles to be drawn horizontally
     * @param heightTilesCount Number of tiles to be drawn vertically
     */
    public GetDisplayMetrics(int widthTilesCount, int heightTilesCount)
    {
        this.widthTilesCount = widthTilesCount;
        this.heightTilesCount = heightTilesCount;

        this.tileWidth = 50;
        this.tileHeight = 50;

        this.offsetX = 2;
        this.offsetY = 2;
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

    public int getTileWidth()
    {
        return tileWidth;
    }

    public void setTileWidth(int tileWidth)
    {
        this.tileWidth = tileWidth;
    }

    public int getTileHeight()
    {
        return tileHeight;
    }

    public void setTileHeight(int tileHeight)
    {
        this.tileHeight = tileHeight;
    }

    public int getOffsetX()
    {
        return offsetX;
    }

    public void setOffsetX(int offsetX)
    {
        this.offsetX = offsetX;
    }

    public int getOffsetY()
    {
        return offsetY;
    }

    public void setOffsetY(int offsetY)
    {
        this.offsetY = offsetY;
    }

    public int getDisplayWidth()
    {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public int getDisplayHeight()
    {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    /**
     * @return Returns a 2D-map of the locations where the tiles will be drawn
     */
    @SuppressWarnings("RedundantCast")
    public Point[][] getTilePoints()
    {
        Point[][] mTilePoints = new Point[widthTilesCount][heightTilesCount];

        int width, height;
        int tileCount;
        int displayWidth;
        int displayHeight;

        displayWidth = getDisplayWidth();
        displayHeight = getDisplayHeight();

        setTileWidth((int) ((displayWidth - widthTilesCount + 1) / widthTilesCount));
        setTileHeight((int) ((displayHeight - heightTilesCount + 1) / heightTilesCount));

        setOffsetX((displayWidth - (tileWidth * widthTilesCount)) / 2);
        setOffsetY((displayHeight - (tileHeight * heightTilesCount)) / 2);

        width = getOffsetX();
        height = getOffsetY();

        tileCount = 1;

        for (int i = 0; i < widthTilesCount; i++)
        {
            for (int j = 0; j < heightTilesCount; j++)
            {
                mTilePoints[i][j] = new Point();
                mTilePoints[i][j].setDimensions(width, height);

                height = height + tileHeight + 1;
            }
            width = width + tileWidth + 1;
            height = getOffsetY();
        }

        for (int j = heightTilesCount; j > 0; j--)
        {
            for (int i = 0; i < widthTilesCount; i++)
            {
                if (j%2 == 0)
                {
                    mTilePoints[i][j-1].setIndex(tileCount);
                }
                else
                {
                    mTilePoints[widthTilesCount-i-1][j-1].setIndex(tileCount);
                }
                tileCount++;
            }
        }

        return mTilePoints;
    }
}
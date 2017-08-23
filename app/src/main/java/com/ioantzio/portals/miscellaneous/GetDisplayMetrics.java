package com.ioantzio.portals.miscellaneous;

import android.content.res.Resources;
import android.util.DisplayMetrics;

public class GetDisplayMetrics
{
    public DisplayMetrics getDisplayMetrics()
    {
        return Resources.getSystem().getDisplayMetrics();
    }

    private int getDisplayWidth()
    {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    private int getDisplayHeight()
    {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    /*
        mTilePoints: 2D array that contains the coordinates of the locations where the game tiles will be drawn
        displayWidth/displayHeight: the width/height of the phone screen the application is currently running
        tileWidth/tileHeight: the calculated width/height of the tile that will be drawn
        offsetX/offsetY: the calculated space from the edge screen to the first tiles
        tileCount: the index of the tiles
    */

    /**
     * @param widthTilesCount Number of tiles to be drawn horizontally
     * @param heightTilesCount Number of tiles to be drawn vertically
     * @return Returns a 2D-map of the locations where the tiles will be drawn
     */
    @SuppressWarnings("RedundantCast")
    public Point[][] getTilePoints(int widthTilesCount, int heightTilesCount)
    {
        int width, height;
        int tileCount;
        Point[][] mTilePoints = new Point[widthTilesCount][heightTilesCount];

        int displayWidth = getDisplayWidth();
        int displayHeight = getDisplayHeight();

        int tileWidth = (int) ((displayWidth - widthTilesCount + 1) / widthTilesCount);
        int tileHeight = (int) ((displayHeight - heightTilesCount + 1) / heightTilesCount);

        int offsetX = (displayWidth - (tileWidth * widthTilesCount)) / 2;
        int offsetY = (displayHeight - (tileHeight * heightTilesCount)) / 2;

        width = offsetX;
        height = offsetY;

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
            height = offsetY;
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
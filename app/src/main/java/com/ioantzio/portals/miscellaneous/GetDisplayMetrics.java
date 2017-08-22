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
    */

    @SuppressWarnings("RedundantCast")
    public Point[][] getTilePoints(int widthTilesCount, int heightTilesCount)
    {
        int width, height;
        Point[][] mTilePoints = new Point[widthTilesCount][heightTilesCount];

        int displayWidth = getDisplayWidth();
        int displayHeight = getDisplayHeight();

        int tileWidth = (int) ((displayWidth - widthTilesCount + 1) / widthTilesCount);
        int tileHeight = (int) ((displayHeight - heightTilesCount + 1) / heightTilesCount);

        int offsetX = (displayWidth - (tileWidth * widthTilesCount)) / 2;
        int offsetY = (displayHeight - (tileHeight * heightTilesCount)) / 2;

        width = offsetX;
        height = offsetY;

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

        return mTilePoints;
    }
}
package com.ioantzio.portals.frontEnd;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.ioantzio.portals.R;
import com.ioantzio.portals.miscellaneous.GetDisplayMetrics;
import com.ioantzio.portals.miscellaneous.TileSizeSelection;
import com.ioantzio.portals.models.Point;

import java.util.HashMap;
import java.util.Map;

public class GameActivity extends AppCompatActivity
{
    private ImageView imageView;
    private Map<String, Integer> tileSizes;

    //Variables for method 'GetDisplayMetrics'
    GetDisplayMetrics getDisplayMetrics;
    TileSizeSelection tileSizeSelection;
    static final int widthTilesCount = 8;
    static final int heightTilesCount = 12;

    //Variables for method 'onBackPressed'
    private static final int waitTime = 2000;
    private long mBackPressed;
    private Toast mExitToast;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        imageView = (ImageView) findViewById(R.id.gameMap);

        getDisplayMetrics = new GetDisplayMetrics(widthTilesCount, heightTilesCount);
//        showDisplayMetrics();

        ImageButton mPlayButton = (ImageButton) findViewById(R.id.playButton);
        mPlayButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(), "Play button pressed", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onBackPressed()
    {
        if (mBackPressed + waitTime > System.currentTimeMillis())
        {
            mExitToast.cancel();
            finish();
            super.onBackPressed();
            return;
        } else
        {
            mExitToast = Toast.makeText(getBaseContext(), "Tap again to exit", Toast.LENGTH_SHORT);
            mExitToast.show();
        }
        mBackPressed = System.currentTimeMillis();
    }

    private void populateTileSizes()
    {
        tileSizes = new HashMap<>();

        tileSizes.put("tile_xx_large", R.drawable.tile_xx_large);
        tileSizes.put("tile_x_large", R.drawable.tile_x_large);
        tileSizes.put("tile_large", R.drawable.tile_large);
        tileSizes.put("tile_medium_large", R.drawable.tile_medium_large);
        tileSizes.put("tile_medium", R.drawable.tile_medium);
        tileSizes.put("tile_medium_small", R.drawable.tile_medium_small);
        tileSizes.put("tile_small", R.drawable.tile_small);
        tileSizes.put("tile_x_small", R.drawable.tile_x_small);
        tileSizes.put("tile_xx_small", R.drawable.tile_xx_small);
    }

    @SuppressWarnings("deprecation")
    private void drawMap(Point[][] tileMap)
    {
        Paint paint;
        Bitmap bitmap;
        Canvas canvas;
        Drawable tile;
        String tileSize;

        populateTileSizes();

        tileSizeSelection = new TileSizeSelection(widthTilesCount, heightTilesCount);
        tileSize = tileSizeSelection.getTileSize(getDisplayMetrics.getDisplayWidth(), getDisplayMetrics.getDisplayHeight());

        bitmap = Bitmap.createBitmap(getDisplayMetrics.getDisplayWidth(), getDisplayMetrics.getDisplayHeight(), Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap);
        paint = new Paint();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        {
            tile = getResources().getDrawable(tileSizes.get(tileSize), null);
        }
        else
        {
            tile = getResources().getDrawable(tileSizes.get(tileSize));
        }

        canvas.drawColor(Color.WHITE);
        paint.setColor(Color.RED);
        paint.setTextSize(16);

        for (int i = 0; i < tileMap.length; i++)
        {
            for (int j = 0; j < tileMap[i].length; j++)
            {
                tile.setBounds(
                        tileMap[i][j].getWidth(),
                        tileMap[i][j].getHeight(),
                        tileMap[i][j].getWidth() + getDisplayMetrics.getTileWidth(),
                        tileMap[i][j].getHeight() + getDisplayMetrics.getTileHeight());

                tile.draw(canvas);

                canvas.drawText(String.valueOf(
                        tileMap[i][j].getIndex()),
                        tileMap[i][j].getWidth() + (getDisplayMetrics.getTileWidth()/4),
                        tileMap[i][j].getHeight() + (getDisplayMetrics.getTileHeight()/4),
                        paint);
            }
        }

        imageView.setImageBitmap(bitmap);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_options, menu);
        return true;
    }

    public void optionsOnClickEvent(MenuItem item)
    {
        Toast.makeText(getApplicationContext(), "Options!", Toast.LENGTH_SHORT).show();
    }

    public void musicOnClickEvent(MenuItem item)
    {
        Toast.makeText(getApplicationContext(), "Music state changed!", Toast.LENGTH_SHORT).show();
    }

    public void soundsOnClickEvent(MenuItem item)
    {
        Toast.makeText(getApplicationContext(), "Sound state changed!", Toast.LENGTH_SHORT).show();
    }

    public void backOnClickEvent(MenuItem item)
    {
        drawMap(getDisplayMetrics.getTilePoints());
        Toast.makeText(getApplicationContext(), "Back!", Toast.LENGTH_SHORT).show();
    }

    public void exitOnClickEvent(MenuItem item)
    {
        finish();
    }
}

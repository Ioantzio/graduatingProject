package com.ioantzio.portals.frontEnd;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.ioantzio.portals.R;
import com.ioantzio.portals.miscellaneous.GetDisplayMetrics;
import com.ioantzio.portals.miscellaneous.Point;

public class GameActivity extends AppCompatActivity
{
    private GetDisplayMetrics getDisplayMetrics;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

//        getDisplayMetrics = new GetDisplayMetrics();
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

    private void showDisplayMetrics()
    {
        int widthTilesCount = 8;
        int heightTilesCount = 12;

        Point[][] mTilePoints = getDisplayMetrics.getTilePoints(widthTilesCount, heightTilesCount);

        /*String message;

        for(int i = 0; i < widthTilesCount; i++)
        {
            for(int j = 0; j < heightTilesCount; j++)
            {
                message = "Tile " + i + ", " + j + " || Width=" + mTilePoints[i][j].getWidth() + " & Height=" +  mTilePoints[i][j].getHeight();
                Log.d("DisplayMetrics", message);
            }
        }*/
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
        Toast.makeText(getApplicationContext(), "Back!", Toast.LENGTH_SHORT).show();
    }

    public void exitOnClickEvent(MenuItem item)
    {
        System.exit(0);
    }
}

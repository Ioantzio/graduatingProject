package com.ioantzio.portals.frontEnd;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.ioantzio.portals.R;

public class GameActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

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
        finish();
    }
}

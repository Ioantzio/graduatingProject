package com.ioantzio.portals.frontEnd;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.ioantzio.portals.R;

public class SettingsActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_movement, menu);
        return true;
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
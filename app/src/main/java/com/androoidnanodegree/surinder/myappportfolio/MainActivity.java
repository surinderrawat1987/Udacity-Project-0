package com.androoidnanodegree.surinder.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.findViewById(R.id.spotifystreamer).setOnClickListener(this);
        this.findViewById(R.id.scoresapp).setOnClickListener(this);
        this.findViewById(R.id.libraryapp).setOnClickListener(this);
        this.findViewById(R.id.builditbigger).setOnClickListener(this);
        this.findViewById(R.id.xyzreader).setOnClickListener(this);
        this.findViewById(R.id.capstone).setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        System.out.println(v.getId());

        Context context = getApplicationContext();
        CharSequence text;

        switch(v.getId()) {
            case R.id.spotifystreamer:
                text = "Spotify Streamer";
                break;
            case R.id.scoresapp:
                text = "Scores App";
                break;
            case R.id.libraryapp:
                text = "Library app!";
                break;
            case R.id.builditbigger:
                text = "Build It Bigger";
                break;
            case R.id.xyzreader:
                text = "Xyz Reader";
                break;
            case R.id.capstone:
                text = "Capstone App";
                break;
        }

        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}

package com.prasharrishi.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.sql.Array;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);
        setupList();
    }

    private void setupList() {
        BucketListEntry[] thingsToDo = {
                new BucketListEntry("Visit Diamond Beach","Diamond Beach in Nusa Penida Island might have the title ‘most beautiful place in Bali.’",R.drawable.balithings,4.5f),
                new BucketListEntry("Plan a Romantic Candlelight Dinner at Soneva Fushi"," The romantic resort of Soneva Fushi for a cozy and intimate dinner date.",R.drawable.malethings,4),
                new BucketListEntry("The Bernina Express","The Bernina line through this site is a spectacular four-hour journey.",R.drawable.swissthings,3.5f),
                new BucketListEntry("Sydney Opera House","A place for classic music lovers who have good taste in music and well as culture ",R.drawable.sydneythings,4),
                new BucketListEntry("Empire State Building","Empire State Building and channelize your inner athlete as you climb 102 floors of stairs!",R.drawable.usathings,2.5f),
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_things_to_do);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(thingsToDo);
        recyclerView.setAdapter(adapter);


    }
}
package com.prasharrishi.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);
        setupList();
    }
    private void setupList() {
        BucketListEntry[] placesToGo = {
                new BucketListEntry("Australia","a sovereign country comprising the mainland of the Australian continent, the island of Tasmania, and numerous smaller islands. ",R.drawable.aus,4.5f),
                new BucketListEntry("Bali","East of Java and west of Lombok, the province includes the island of bali and few neighbouring islands.",R.drawable.indo,4),
                new BucketListEntry("Maldives","The Republic of Maldives, is an archipelagic state located in South Asia, situated in the Indian Ocean.",R.drawable.male,3.5f),
                new BucketListEntry("Switzerland","A mountainous Central European country, home to numerous lakes, villages and the high peaks of the Alps.  ",R.drawable.swissthings,4),
                new BucketListEntry("New York","Its iconic sites include skyscrapers such as the Empire State Building and sprawling Central Park. Broadway theater is staged in neon-lit Times Square.",R.drawable.usa,2.5f),
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_places_to_go);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(placesToGo);
        recyclerView.setAdapter(adapter);


    }
}
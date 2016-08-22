package com.example.android.tourdujour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Bases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Destination> destinations = new ArrayList<Destination>();
        destinations.add(new Destination ("Andrews Airforce Base", "address", R.drawable.seal_airforce));
        destinations.add(new Destination ("Fort Belvoir Army Base", "address", R.drawable.seal_army));
        destinations.add(new Destination ("Fort Meade Army Base", "address", R.drawable.seal_army));
        destinations.add(new Destination ("Marine Corps Base Quantico", "address", R.drawable.seal_marines));


        DestinationAdapter adapter = new DestinationAdapter(this, destinations, R.color.category_bases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

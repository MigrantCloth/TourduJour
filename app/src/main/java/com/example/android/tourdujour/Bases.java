package com.example.android.tourdujour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Bases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.destination_list);

        ArrayList<Destination> destinations = new ArrayList<Destination>();
        destinations.add(new Destination ("Aberdeen Proving Ground", "4727 Deer Creek Loop, Aberdeen Proving Ground, MD 21005", R.drawable.army));
        destinations.add(new Destination ("Andrews Airforce Base", "1811 G Street. Andrews Air Force Base. JB Andrews, MD 20762", R.drawable.airforce));
        destinations.add(new Destination ("Fort Belvoir Army Base", "9910 Tracy Loop, Fort Belvoir, VA 22060", R.drawable.army));
        destinations.add(new Destination ("Fort Meade Army Base", "4409 Llewellyn Ave, Fort Meade, MD 20755", R.drawable.army));
        destinations.add(new Destination ("Joint Base Anacostia-Bolling", "20 MacDill Blvd #207, Washington, DC 20032", R.drawable.army));
        destinations.add(new Destination ("Joint Base Myer-Henderson Hall", "Hatfield Gate, 2nd Street South, Fort Myer, VA 22211 ", R.drawable.army));
        destinations.add(new Destination ("Naval Air Station Patuxent River", "21967 Cuddihy Rd, Patuxent River, MD 20670", R.drawable.navy));
        destinations.add(new Destination ("Marine Corps Base Quantico", "3250 Catlin Ave, Quantico, VA 22134", R.drawable.marines));
        destinations.add(new Destination ("Coast Guard Sector Baltimore", "2401 Hawkins Point Rd, Baltimore, MD 21226", R.drawable.coastguard));


        DestinationAdapter adapter = new DestinationAdapter(this, destinations, R.color.category_bases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

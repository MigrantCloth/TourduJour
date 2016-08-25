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
        destinations.add(new Destination(R.string.APG, R.string.APGAdd, R.drawable.army));
        destinations.add(new Destination(R.string.Andrews, R.string.AndrewsAdd, R.drawable.airforce));
        destinations.add(new Destination(R.string.Belvoir, R.string.BelvoirAdd, R.drawable.army));
        destinations.add(new Destination(R.string.Meade, R.string.MeadeAdd, R.drawable.army));
        destinations.add(new Destination(R.string.Anacostia, R.string.AnacostiaAdd, R.drawable.army));
        destinations.add(new Destination(R.string.Myer, R.string.MyerAdd, R.drawable.army));
        destinations.add(new Destination(R.string.PaxRiver, R.string.PaxRiverAdd, R.drawable.navy));
        destinations.add(new Destination(R.string.Quantico, R.string.QuanticoAdd, R.drawable.marines));
        destinations.add(new Destination(R.string.CoastGuard, R.string.CoastGuardAdd, R.drawable.coastguard));

        DestinationAdapter adapter = new DestinationAdapter(this, destinations, R.color.category_bases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

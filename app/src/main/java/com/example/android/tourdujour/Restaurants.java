package com.example.android.tourdujour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        ArrayList<Destination> destinations = new ArrayList<Destination>();
        destinations.add(new Destination ("Ben's Chili Bowl", "address", R.drawable.ben));
        destinations.add(new Destination ("Hank's Oyster Bar", "address", R.drawable.hank));
        destinations.add(new Destination ("STK", "address", R.drawable.stkbrunch));
        destinations.add(new Destination ("Busboys & Poets", "address", R.drawable.bus));


        DestinationAdapter adapter = new DestinationAdapter(this, destinations, R.color.category_restaurants);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

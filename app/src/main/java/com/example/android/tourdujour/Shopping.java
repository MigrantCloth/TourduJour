package com.example.android.tourdujour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Shopping extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        ArrayList<Destination> destinations = new ArrayList<Destination>();
        destinations.add(new Destination ("Pentagon City Mall", "address", R.drawable.pentagoncity));
        destinations.add(new Destination("Potomac Mills Mall", "address", R.drawable.potomacmills));
        destinations.add(new Destination ("Tyson's Corner Mall", "address", R.drawable.tysonscorner));



        DestinationAdapter adapter = new DestinationAdapter(this, destinations, R.color.category_shopping);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

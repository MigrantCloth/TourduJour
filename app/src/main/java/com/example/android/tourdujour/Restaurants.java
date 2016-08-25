package com.example.android.tourdujour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.destination_list);

        ArrayList<Destination> destinations = new ArrayList<Destination>();
        destinations.add(new Destination(R.string.Ben, R.string.BenAdd, R.drawable.ben));
        destinations.add(new Destination(R.string.Hank, R.string.HankAdd, R.drawable.hanks));
        destinations.add(new Destination(R.string.STK, R.string.STKAdd, R.drawable.stk));
        destinations.add(new Destination(R.string.Busboys, R.string.BusboysAdd, R.drawable.busboys));
        destinations.add(new Destination(R.string.Capitol, R.string.CapitolAdd,R.drawable.capitolbrewery));
        destinations.add(new Destination(R.string.LaTasca, R.string.LaTascaAdd, R.drawable.latasca));
        destinations.add(new Destination(R.string.TCB, R.string.TCBAdd, R.drawable.cockandbowl));
        destinations.add(new Destination(R.string.Kramer, R.string.KramerAdd,R.drawable.kramer));

        DestinationAdapter adapter = new DestinationAdapter(this, destinations, R.color.category_restaurants);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

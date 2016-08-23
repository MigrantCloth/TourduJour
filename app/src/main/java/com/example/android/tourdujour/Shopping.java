package com.example.android.tourdujour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Shopping extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.destination_list);

        ArrayList<Destination> destinations = new ArrayList<Destination>();
        destinations.add(new Destination ("Pentagon City Mall", "1100 S Hayes St, Arlington, VA 22202", R.drawable.pentagoncity));
        destinations.add(new Destination("Potomac Mills Mall", "2700 Potomac Mills Cir, Woodbridge, VA 22192", R.drawable.potomacmills));
        destinations.add(new Destination ("Tyson's Galleria", "2001 International Dr, McLean, VA 22102", R.drawable.tysons));
        destinations.add(new Destination ("Union Station", "50 Massachusetts Ave NE, Washington, DC 20002", R.drawable.unionstation));
        destinations.add(new Destination ("Chevy Chase Pavilion", "5335 Wisconsin Ave NW, Washington, DC 20015", R.drawable.chevychase));
        destinations.add(new Destination ("City Center DC", "825 10th St NW, Washington, DC 20001", R.drawable.citycenter));
        destinations.add(new Destination ("Eastern Market", "225 7th St SE, Washington, DC 20003", R.drawable.easternmarket));





        DestinationAdapter adapter = new DestinationAdapter(this, destinations, R.color.category_shopping);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

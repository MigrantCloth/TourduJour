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
        destinations.add(new Destination("Ben's Chili Bowl", "1213 U St NW, Washington, DC 20009-4442", R.drawable.ben));
        destinations.add(new Destination("Hank's Oyster Bar", "1624 Q St NW, Washington, DC 20009", R.drawable.hanks));
        destinations.add(new Destination("STK", "1250 Connecticut Ave NW, Washington, DC 20036", R.drawable.stk));
        destinations.add(new Destination("Busboys & Poets", "2021 14th St NW, Washington, DC 20009", R.drawable.busboys));
        destinations.add(new Destination("Capitol Brewery", "4001 Campbell Ave, Arlington, VA 22206", R.drawable.capitolbrewery));
        destinations.add(new Destination("La Tasca", "722 7th St NW, Washington, DC 20001", R.drawable.latasca));
        destinations.add(new Destination("The Cock and Bowl", "address", R.drawable.cockandbowl));
        destinations.add(new Destination("KRAMERBOOKS & afterwords", "address", R.drawable.kramer));

        DestinationAdapter adapter = new DestinationAdapter(this, destinations, R.color.category_restaurants);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

package com.example.android.tourdujour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;
import java.util.ArrayList;

public class Attractions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.destination_list);

        ArrayList<Destination> destinations = new ArrayList<Destination>();
        destinations.add(new Destination ("Martin Luther King, Jr. Monument", "1964 Independence Ave SW, Washington, DC 20024", R.drawable.mlkjr));
        destinations.add(new Destination ("Franklin Delano Roosevelt Monument", "1850 West Basin Dr SW, Washington, DC 20242", R.drawable.fdr));
        destinations.add(new Destination ("World War II Memorial", "17th Street, Washington, DC 20006", R.drawable.wwii));
        destinations.add(new Destination ("Lincoln Memorial", "2 Lincoln Memorial Cir NW, Washington, DC 20037", R.drawable.loc));
        destinations.add(new Destination ("Washington Monument", "2 15th St NW, Washington, DC 20024", R.drawable.washmonument));
        destinations.add(new Destination ("Lincol Memorial Reflection Pool", "2 Lincoln Memorial Cir NW, Washington, DC 20024", R.drawable.reflectingpool));
        destinations.add(new Destination ("Madam Tussades Wax Museum", "1001 F St NW, Washington, DC 20004", R.drawable.tussads));
        destinations.add(new Destination ("Smithsonian Air & Space Museum", "600 Independence Ave SW, Washington, DC 20560", R.drawable.smithsonian));
        destinations.add(new Destination ("International Spy Museum", "800 F St NW, Washington, DC 20004", R.drawable.spy));



        DestinationAdapter adapter = new DestinationAdapter(this, destinations, R.color.category_attractions);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }


}

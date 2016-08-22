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
        setContentView(R.layout.list_item);

        ArrayList<Destination> destinations = new ArrayList<Destination>();
        destinations.add(new Destination ("Martin Luther King, Jr. Monument", "address", R.drawable.mlk));
        destinations.add(new Destination ("Franklin Delano Roosevelt Monument", "address", R.drawable.fdr));
        destinations.add(new Destination ("World War II Memorial", "address", R.drawable.wwii));
        destinations.add(new Destination ("Library of Congress", "address", R.drawable.loc));


        DestinationAdapter adapter = new DestinationAdapter(this, destinations, R.color.category_attractions);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }


}

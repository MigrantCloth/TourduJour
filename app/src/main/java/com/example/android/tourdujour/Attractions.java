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
        destinations.add(new Destination(R.string.MLK, R.string.MLKAdd, R.drawable.mlkjr));
        destinations.add(new Destination(R.string.FDR, R.string.FDRAdd, R.drawable.fdr));
        destinations.add(new Destination(R.string.wwii, R.string.wwiiAdd, R.drawable.wwii));
        destinations.add(new Destination(R.string.Lincoln, R.string.LincolnAdd, R.drawable.lincoln));
        destinations.add(new Destination(R.string.Wash, R.string.WashAdd, R.drawable.washmonument));
        destinations.add(new Destination(R.string.Pool, R.string.PoolAdd, R.drawable.reflectingpool));
        destinations.add(new Destination(R.string.Tussauds, R.string.TussaudsAdd, R.drawable.tussads));
        destinations.add(new Destination(R.string.Smithsonian, R.string.SmithAdd, R.drawable.smithsonian));
        destinations.add(new Destination(R.string.Spy, R.string.SpyAdd, R.drawable.spy));

        DestinationAdapter adapter = new DestinationAdapter(this, destinations, R.color.category_attractions);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }


}

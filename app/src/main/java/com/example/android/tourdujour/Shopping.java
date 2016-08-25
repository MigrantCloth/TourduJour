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
        destinations.add(new Destination(R.string.Pentagon, R.string.PentagonAdd, R.drawable.pentagoncity));
        destinations.add(new Destination(R.string.Potomac, R.string.PotomacAdd, R.drawable.potomacmills));
        destinations.add(new Destination(R.string.Tysons, R.string.TysonsAdd, R.drawable.tysons));
        destinations.add(new Destination(R.string.UnionStation, R.string.UnionAdd, R.drawable.unionstation));
        destinations.add(new Destination(R.string.ChevyChase, R.string.ChevyChaseAdd, R.drawable.chevychase));
        destinations.add(new Destination(R.string.CityCenter, R.string.CityCenterAdd, R.drawable.citycenter));
        destinations.add(new Destination(R.string.EasternMarket, R.string.EMAdd, R.drawable.easternmarket));

        DestinationAdapter adapter = new DestinationAdapter(this, destinations, R.color.category_shopping);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

package com.example.android.tourdujour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Find the View that shows the attractions category
        TextView attractions = (TextView) findViewById(R.id.attractions);

        // Set a click listener on that View
        attractions.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the attractions View is clicked on.
            @Override
            public void onClick(View view) {
                Intent attractionsIntent = new Intent(MainActivity.this, Attractions.class);
                startActivity(attractionsIntent);
            }
        });

        // Find the View that shows the bases category
        TextView bases = (TextView) findViewById(R.id.bases);

        // Set a click listener on that View
        bases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the bases View is clicked on.
            @Override
            public void onClick(View view) {
                Intent basesIntent = new Intent(MainActivity.this, Bases.class);
                startActivity(basesIntent);
            }
        });

        // Find the View that shows the restaurants category
        TextView restaurants = (TextView) findViewById(R.id.restaurants);

        // Set a click listener on that View
        restaurants.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(MainActivity.this, Restaurants.class);
                startActivity(restaurantsIntent);
            }
        });

        // Find the View that shows the shopping category
        TextView shopping = (TextView) findViewById(R.id.shopping);

        // Set a click listener on that View
        shopping.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the shopping View is clicked on.
            @Override
            public void onClick(View view) {
                Intent shoppingIntent = new Intent(MainActivity.this, Shopping.class);
                startActivity(shoppingIntent);
            }
        });
    }
}
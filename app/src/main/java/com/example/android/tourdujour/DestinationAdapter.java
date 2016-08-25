package com.example.android.tourdujour;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.tourdujour.Destination;
import com.example.android.tourdujour.R;

import java.util.ArrayList;

/**
 * Created by uzuri17 on 8/13/2016.
 */
public class DestinationAdapter extends ArrayAdapter <Destination> {
    private int mColorResourceID;
    public DestinationAdapter(Activity context, ArrayList<Destination> destinations, int colorResourceID) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, destinations);
        mColorResourceID = colorResourceID;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the destination object located at this position in the list
        Destination currentDestination = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentDestination.getDestinationName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        addressTextView.setText(currentDestination.getDestinationAddress());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        iconView.setImageResource(currentDestination.getImageResourceID());
        iconView.setVisibility(View.VISIBLE);

        //Set them for color in layout
        View textContainer = listItemView.findViewById(R.id.text_container);
        //Find the color that the resource maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceID);
        //Set background color
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}

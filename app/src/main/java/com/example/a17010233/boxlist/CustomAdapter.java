package com.example.a17010233.boxlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 17010233 on 24/7/2018.
 */

public class CustomAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<BoxColour> boxItem;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<BoxColour> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        boxItem = objects;
    }

    @NonNull

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        ImageView colour = rowView.findViewById(R.id.imageViewColour);

        BoxColour currentItem = boxItem.get(position);


        if(currentItem.getColour().equals("blue")) {
            colour.setImageResource(R.drawable.blue_box);

        } else if (currentItem.getColour().equals("orange")) {
            colour.setImageResource(R.drawable.orange_box);

        } else {
            colour.setImageResource(R.drawable.brown_box);
        }

        return rowView;
    }


}

package com.example.a17010233.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvColour;

    ArrayList<BoxColour> alColourList;

    CustomAdapter caColour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvColour = findViewById(R.id.listViewBox);

        alColourList = new ArrayList<>();

        BoxColour box1 = new BoxColour("blue");
        BoxColour box2 = new BoxColour("orange");
        BoxColour box3 = new BoxColour("brown");

        alColourList.add(box1);
        alColourList.add(box2);
        alColourList.add(box3);

        caColour = new CustomAdapter(this, R.layout.custom_listview, alColourList);

        lvColour.setAdapter(caColour);

    }
}

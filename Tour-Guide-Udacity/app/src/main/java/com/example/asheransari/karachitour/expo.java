package com.example.asheransari.karachitour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 10/25/2016.
 */
public class expo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<tourClass> tourClasses = new ArrayList<tourClass>();

        tourClasses.add(new tourClass("Build Pakistan","Build Pakistan is a 3 day event being held from 27th October to the 29th October 2016"));
        tourClasses.add(new tourClass("International Defence Exhibition And Seminar","The International Defence Exhibition and Seminar (IDEAS) therefore, presents a display of a wide variety of technology"));
        tourClasses.add(new tourClass("Furniture Asia","Furniture Asia is a 3 day event being held from 6th December to the 8th December 2016"));
        tourClasses.add(new tourClass("Property Asia","Property Asia is definitely poised to become Asia's biggest property and real estate "));
        tourClasses.add(new tourClass("Mines & Minerals Show","Mines & Minerals Show is a 3 day event being held from 6th January to 8th January 2017"));
        tourClasses.add(new tourClass("Pak Water Expo","Pak Water Expo is a 3 day event being held from 10th January to 12th January 2017"));
        tourClasses.add(new tourClass("Gtex B2B Textile Machine Expo","Gtex B2B Textile Machine Expo organize by Global Enterprise will be held on January 24th to 26th 2016"));
        tourClasses.add(new tourClass("Dawn Education Expo-Karachi","Dawn Education Expo-Karachi is a 2 day event being held from 28th & 29th January 2017"));
        tourClasses.add(new tourClass("Pak Travel and Tour Expo","Pak Travel and Tour Expo is a 3 day event being held from 10th March to 12th March 2017"));
        tourClasses.add(new tourClass("Oil & Gas Asia Exhibition & Conference","Oil & Gas Asia Exhibition & Conference is a 3 day event being held from 14th March"));

        tourAdapter adapter = new tourAdapter(this, tourClasses,R.color.expo);
        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

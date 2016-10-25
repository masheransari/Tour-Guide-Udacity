package com.example.asheransari.karachitour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 10/25/2016.
 */
public class park extends AppCompatActivity
{

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_list);

            ArrayList<tourClass> tourClasses = new ArrayList<tourClass>();

            tourClasses.add(new tourClass("Aram Bhag","Saddar Town"));
            tourClasses.add(new tourClass("Askari Park","Gulshan-e-Iqbal Town"));
            tourClasses.add(new tourClass("Babul Islam Play Ground","New Karachi Town"));
            tourClasses.add(new tourClass("Bagh Ibne Qasim Clifton Cantonment","Clifton Cantonment"));
            tourClasses.add(new tourClass("Botanical Garden,","Gulshan-e-Iqbal Town"));
            tourClasses.add(new tourClass("Central Park, Sector T","Gulshan-e-Maymar, Taiser Town"));
            tourClasses.add(new tourClass("Mudassir Park","Gulshan-e-Iqbal Town"));
            tourClasses.add(new tourClass("Naveen Bhai Ground","Lyari Town"));
            tourClasses.add(new tourClass("Park Orangi Town","Orangi Town"));
            tourClasses.add(new tourClass("The Forum Clifton Cantonment Board Park","Clifton Cantonment"));

            tourAdapter adapter = new tourAdapter(this, tourClasses,R.color.parks);
            ListView listView = (ListView)findViewById(R.id.list);

            listView.setAdapter(adapter);
        }
    }

package com.example.asheransari.karachitour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 10/25/2016.
 */
public class school extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<tourClass> tourClasses = new ArrayList<tourClass>();

        tourClasses.add(new tourClass("",""));
        tourClasses.add(new tourClass("",""));
        tourClasses.add(new tourClass("",""));
        tourClasses.add(new tourClass("",""));
        tourClasses.add(new tourClass("",""));
        tourClasses.add(new tourClass("",""));
        tourClasses.add(new tourClass("",""));
        tourClasses.add(new tourClass("",""));
        tourClasses.add(new tourClass("",""));
        tourClasses.add(new tourClass("",""));

        tourAdapter adapter = new tourAdapter(this, tourClasses,R.color.islamic);
        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
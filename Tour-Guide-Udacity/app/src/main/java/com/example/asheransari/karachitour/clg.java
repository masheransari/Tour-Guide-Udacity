package com.example.asheransari.karachitour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 10/25/2016.
 */
public class clg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<tourClass> tourClasses = new ArrayList<tourClass>();

        tourClasses.add(new tourClass("D. J. Sindh Government Science College","Near Jang Press Chowrangi, Dr. Ziauddin Road, Saddar Town"));
        tourClasses.add(new tourClass("Government Aisha Bawani College","Saddar Town"));
        tourClasses.add(new tourClass("Government Boys College","Korangi-2½"));
        tourClasses.add(new tourClass("Government Boys College","Landhi-4"));
        tourClasses.add(new tourClass("Government Boys College","Surjani Town"));
        tourClasses.add(new tourClass("Government College for Boys","Asifabad, SITE Town"));
        tourClasses.add(new tourClass("Government College for Men Nazimabad","Liaquatabad Town"));
        tourClasses.add(new tourClass("Government College of Commerce & Economics","Dr. Ziauddin Road, Near PIDC Building"));
        tourClasses.add(new tourClass("Government Country College Musa Colony","Gulberg Town"));
        tourClasses.add(new tourClass("Government Degree Boys Post Graduate College","Gulistan-e-Jauhar, Gulshan Town"));

        tourAdapter adapter = new tourAdapter(this, tourClasses,R.color.clg);
        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
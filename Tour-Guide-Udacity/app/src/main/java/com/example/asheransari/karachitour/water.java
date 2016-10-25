package com.example.asheransari.karachitour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 10/25/2016.
 */
public class water extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<tourClass> tourClasses = new ArrayList<tourClass>();

        tourClasses.add(new tourClass("SUNWAY LAGOON WATER PARK ","Sunway Lagoon is one of the famous water park in Karachi located at 5 mins drive from Gharo."));
        tourClasses.add(new tourClass("PICNIC WORLD WATER PARK ","Picnic World Water Park is a great way to chill in hot summer of Karachi. Its an outstanding water recreation heaven"));
        tourClasses.add(new tourClass("FIESTA WATER PARK ","The Great Fiesta Water Park is a technical, action filled, awesome performer with new attractions and wonderfu"));
        tourClasses.add(new tourClass("AL MEHRAN WATER PARK ","Al Mehran Water Park is an amazing place to visit in vacations especially in summer from June – July. "));
        tourClasses.add(new tourClass("DREAMWORLD ","Dreamworld Family Resort is one of the pioneer vacation spot in the city with all the essential features "));
        tourClasses.add(new tourClass("SAMZU WATER PARK ","Karachi has a gigantic variety of water parks, amusement parks and big resorts. Samzu Water Park & Zoo "));
        tourClasses.add(new tourClass("COSY WATER PARK ","Cosy Water Park is one of the largest water park of Pakistan located near Super Highway behind New Sabzi Mandi Just 20 mins drive from Sohrab Goth. Th More »"));
        tourClasses.add(new tourClass("KARACHI ZOO ","Karachi Zoo located at Garden East Area, in Jamshad Town, Karachi, Pakistan. This zoo was first establish in year 1878"));
        tourClasses.add(new tourClass("ALADDIN PARK ","Aladdin Park is one of the famous family parks located on Rashid Minhas Road, Gulshan-e-Iqbal, Karachi"));
        tourClasses.add(new tourClass("PARADISE POINT ","Paradise Point is a famous beach on Arabian Sea located near Sandspit Beach"));

        tourAdapter adapter = new tourAdapter(this, tourClasses,R.color.water);
        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
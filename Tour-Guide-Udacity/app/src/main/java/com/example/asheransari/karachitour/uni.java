package com.example.asheransari.karachitour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 10/25/2016.
 */
public class uni extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<tourClass> tourClasses = new ArrayList<tourClass>();

        tourClasses.add(new tourClass("Aga Khan university","Stadium Road, P.O. Box 3500,Karachi 74800, Karachi"));
        tourClasses.add(new tourClass("Bahria Institute Of Management","Bahria University Statdium"));
        tourClasses.add(new tourClass("Baqai Medical University","51, Deh Tor, Gadap Road, Super Highway, Karachi"));
        tourClasses.add(new tourClass("College Of Business Management","PAF Base,Korangi Creek."));
        tourClasses.add(new tourClass("Dow Medical College & Civil Hospital","Baba-e-Urdu Road."));
        tourClasses.add(new tourClass("Institute of Industrial Electronics Engineering","Street 22/C, Block 6,Gulshan-e-Iqbal"));
        tourClasses.add(new tourClass("Iqra University","Defence View Shahed Millat Road"));
        tourClasses.add(new tourClass("Mohammad Ali Jinnah University","22 / E, Block / 6P.E.C.H.S"));
        tourClasses.add(new tourClass("Preston University","15-Banglore Town,Shahrah-e-Faisal"));
        tourClasses.add(new tourClass("Sir Syed University of Engineering and Technology","University Road, Karachi-75300, Pakistan Karachi"));

        tourAdapter adapter = new tourAdapter(this, tourClasses,R.color.uni);
        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
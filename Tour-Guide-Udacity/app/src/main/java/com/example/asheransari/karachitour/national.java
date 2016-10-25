package com.example.asheransari.karachitour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * Created by asher.ansari on 10/25/2016.
 */
public class national extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Log.e("national","IN National Activity");
        ArrayList<tourClass> tourClasses = new ArrayList<tourClass>();

        tourClasses.add(new tourClass("Pakistan Flower Show","February, 23 To 26"));
        tourClasses.add(new tourClass("Jashn-e-Baharaan","The celebrations with the start of Spring season"));
        tourClasses.add(new tourClass("Pakistan Day","Republic Day and to commemorate the Lahore Resolution"));
        tourClasses.add(new tourClass("Youm-e-Takbir","Celebrated in commemoration of the first Nuclear test"));
        tourClasses.add(new tourClass("Independence Day","Pakistan is Independent in 1947"));
        tourClasses.add(new tourClass("Defence Day","Celebrated in memory of those who were killed in the Indo-Pak war of 1965"));
        tourClasses.add(new tourClass("Air Force Day","Celebrated to commend the role of Pakistan Air Force in the 1965 war with India"));
        tourClasses.add(new tourClass("Iqbal Day","Birthday of Muhammad Iqbal"));
        tourClasses.add(new tourClass("Quaid-e-Azam Day","Birthday of Muhammad Ali Jinnah"));
//        tourClasses.add(new tourClass("",""));

        tourAdapter adapter = new tourAdapter(this, tourClasses,R.color.national);
        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

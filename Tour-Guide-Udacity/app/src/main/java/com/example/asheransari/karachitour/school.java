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

        tourClasses.add(new tourClass("Aisha Children Paradise",""));
        tourClasses.add(new tourClass("Aisha English Secondary School","C-34, Block A North Nazimabad"));
        tourClasses.add(new tourClass("Al-Muhammad Academy","F-68, Block B North Nazimabad"));
        tourClasses.add(new tourClass("Al-Nusrat Memorial Model Secondary School","B-69-70, Block N North Nazimabad"));
        tourClasses.add(new tourClass("Al-Saqib Public Secondary School","4/F, 4/4 Campus II North Nazimabad"));
        tourClasses.add(new tourClass("Bilal Public Secondary School","Bilal Public Secondary School 5-C-2 North Nazimabad"));
        tourClasses.add(new tourClass("Bliss English School","A-623, Block H North Nazimabad"));
        tourClasses.add(new tourClass("BRIGHT CAREER PUBLIC SECONDARY SCHOOL","Block No.20, F.B. Area Karachi"));
        tourClasses.add(new tourClass("Central Point Grammar School","B-278 Block N North Nazimabad"));
        tourClasses.add(new tourClass("CHARTERHOUSE PUBLIC SCHOOL","G/28, Block-B, North Nazimabad Karachi"));

        tourAdapter adapter = new tourAdapter(this, tourClasses,R.color.school);
        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
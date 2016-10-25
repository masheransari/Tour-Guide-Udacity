package com.example.asheransari.karachitour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t_islam, t_national, t_hospital, t_uni, t_clg, t_school, t_expo, t_water, t_park;

        t_islam = (TextView)findViewById(R.id.islamic);
        t_national = (TextView)findViewById(R.id.national);
        t_uni = (TextView)findViewById(R.id.uni);
        t_hospital = (TextView)findViewById(R.id.hospital);
        t_clg = (TextView)findViewById(R.id.clg);
        t_school = (TextView)findViewById(R.id.school);
        t_expo = (TextView)findViewById(R.id.expo);
        t_water = (TextView)findViewById(R.id.water);
        t_park = (TextView)findViewById(R.id.park);

        t_islam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, islam.class);
                startActivity(i);
            }
        });

        t_national.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, national.class);
                startActivity(i);
            }
        });

        t_uni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, uni.class);
                startActivity(i);
            }
        });

        t_hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, hospital.class);
                startActivity(i);
            }
        });

        t_clg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, clg.class);
                startActivity(i);
            }
        });

        t_school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, school.class);
                startActivity(i);
            }
        });

        t_expo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, expo.class);
                startActivity(i);
            }
        });

        t_water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, water.class);
                startActivity(i);
            }
        });

        t_park.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, park.class);
                startActivity(i);
            }
        });
    }
}

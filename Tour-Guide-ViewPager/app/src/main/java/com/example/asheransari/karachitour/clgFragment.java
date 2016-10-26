package com.example.asheransari.karachitour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewGroupCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class clgFragment extends Fragment {

    public clgFragment()
    {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_list, container, false);
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

        tourAdapter adapter = new tourAdapter(getActivity(), tourClasses,R.color.clg);
        ListView listView = (ListView)rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }
}

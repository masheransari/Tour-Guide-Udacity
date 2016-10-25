package com.example.asheransari.karachitour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 10/25/2016.
 */
public class hospital extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<tourClass> tourClasses = new ArrayList<tourClass>();

        tourClasses.add(new tourClass("A-One Hospital","Shah Faisal Colony"));
        tourClasses.add(new tourClass("A.A.Skin Centre","2, Mezz. Floor, M.A. Jinnah Road"));
        tourClasses.add(new tourClass("A.K. Centre","Sharfabad"));
        tourClasses.add(new tourClass("A.O.Clinic (Pvt.) Ltd","IV-F-15/5, Nazimabad"));
        tourClasses.add(new tourClass("Abbas Clinic","Soldier Bazar"));
        tourClasses.add(new tourClass("Abbasi Shaheed Hospital","Block M, North Nazimabad, Karachi-74700. PAKISTAN"));
        tourClasses.add(new tourClass("Abid Clinc","Hussainabad, F.B. Area"));
        tourClasses.add(new tourClass("Ahmed Eye Hospital","B00-76, BL. #15, OPP: Usmania Restaurant, Gulshan-e-Iqbal"));
        tourClasses.add(new tourClass("Ail Clinic","DEPOT LINE, M.A. Jinnah Road"));
        tourClasses.add(new tourClass("Akhai Medical & Diabetic Centre","R-357/15, Dastagir Society, F.B. Area"));
        tourClasses.add(new tourClass("Akram Eye Clinic & Mehran Medical Complex","Mehran Medical Complex 157 , Malir"));
        tourClasses.add(new tourClass("Al-Khidmat Hospital","ST-25 Shah Faisal COlony# 1"));
        tourClasses.add(new tourClass("Al-Rehman Dawakhana","\tK-47 ,Block N, North Nazimabad"));

        tourAdapter adapter = new tourAdapter(this, tourClasses,R.color.hospital);
        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

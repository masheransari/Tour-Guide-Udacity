package com.example.asheransari.karachitour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 10/25/2016.
 */
public class islam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<tourClass> tourClasses = new ArrayList<tourClass>();

        tourClasses.add(new tourClass("Lailat al Miraj","Thursday, May 05, 2016"));
        tourClasses.add(new tourClass("Lailat al Bara'ah","Saturday, May 21, 2016"));
        tourClasses.add(new tourClass("Ramadan (start)","Tuesday, Jun 07, 2016"));
        tourClasses.add(new tourClass("Laylat al Kadr","Saturday, Jul 02, 2016"));
        tourClasses.add(new tourClass("Eid-al-Fitr (End of Ramadan)","Thursday, Jul 07, 2016"));
        tourClasses.add(new tourClass("Waqf al Arafa - Hajj","Saturday, Sep 10, 2016"));
        tourClasses.add(new tourClass("Eid-al-Adha","Tuesday, Sep 13, 2016"));
        tourClasses.add(new tourClass("Hijra - Islamic New Year","Monday, Oct 03, 2016"));
        tourClasses.add(new tourClass("Day of Ashura / Muharram","Wednesday, Oct 12, 2016"));
        tourClasses.add(new tourClass("Milad un Nabi","Monday, Dec 12, 2016"));

        tourAdapter adapter = new tourAdapter(this, tourClasses,R.color.islamic);
        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

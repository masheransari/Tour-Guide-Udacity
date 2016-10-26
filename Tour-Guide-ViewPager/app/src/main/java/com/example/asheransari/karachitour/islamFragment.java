package com.example.asheransari.karachitour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 10/26/2016.
 */
public class islamFragment extends Fragment {
    public islamFragment()
    {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_list, container,false);
        ArrayList<tourClass> tourClasses = new ArrayList<tourClass>();

        tourClasses.add(new tourClass("Lailat al Miraj", "Thursday, May 05, 2016"));
        tourClasses.add(new tourClass("Lailat al Bara'ah", "Saturday, May 21, 2016"));
        tourClasses.add(new tourClass("Ramadan (start)", "Tuesday, Jun 07, 2016"));
        tourClasses.add(new tourClass("Laylat al Kadr", "Saturday, Jul 02, 2016"));
        tourClasses.add(new tourClass("Eid-al-Fitr (End of Ramadan)", "Thursday, Jul 07, 2016"));
        tourClasses.add(new tourClass("Waqf al Arafa - Hajj", "Saturday, Sep 10, 2016"));
        tourClasses.add(new tourClass("Eid-al-Adha", "Tuesday, Sep 13, 2016"));
        tourClasses.add(new tourClass("Hijra - Islamic New Year", "Monday, Oct 03, 2016"));
        tourClasses.add(new tourClass("Day of Ashura / Muharram", "Wednesday, Oct 12, 2016"));
        tourClasses.add(new tourClass("Milad un Nabi", "Monday, Dec 12, 2016"));

        tourAdapter adapter = new tourAdapter(getActivity(), tourClasses, R.color.islamic);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }
}

package com.example.asheransari.karachitour;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 10/25/2016.
 */
public class tourAdapter extends ArrayAdapter<tourClass>{

    private int mColorResourceId;
    public tourAdapter(Activity activity, ArrayList<tourClass> classes, int ColorResourceId)
    {
        super(activity,0,classes);
        mColorResourceId = ColorResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listItemView = convertView;
        if (listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        tourClass currentTour = getItem(position);

        TextView mainText = (TextView)listItemView.findViewById(R.id.Main_text);
        mainText.setText(currentTour.getMainText());

        TextView detailText = (TextView)listItemView.findViewById(R.id.detail_text);
        detailText.setText(currentTour.getDetailText());

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image_view);

        if (currentTour.hasImage())
        {
            imageView.setImageResource(currentTour.getmImageResourseID());
            imageView.setVisibility(View.VISIBLE);
        }
        else
        {
            imageView.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);

        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}

package com.example.asheransari.karachitour;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by asher.ansari on 10/26/2016.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;
    public CategoryAdapter(Context context,FragmentManager fm)
    {
        super(fm);
        mContext = context;
    }
    @Override
    public Fragment getItem(int position) {

    if (position == 0)
    {
        return new islamFragment();
    }
    else if (position==1)
    {
        return new nationalFragment();
    }
    else if (position ==2)
    {
        return new uniFragment();
    }
    else if(position==3)
    {
        return new clgFragment();
    }
    else
    {
        return new schoolGFragment();
    }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        if (position ==0)
        {
            return mContext.getString(R.string.category_islamic);
        }
        else if (position==1)
        {
            return mContext.getString(R.string.category_national);
        }
        else if (position ==2)
        {
            return mContext.getString(R.string.category_uni);
        }
        else if(position==3)
        {
            return mContext.getString(R.string.category_clg);
        }
        else
        {
            return mContext.getString(R.string.category_school);
        }
    }

}

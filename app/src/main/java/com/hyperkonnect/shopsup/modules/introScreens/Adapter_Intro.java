package com.hyperkonnect.shopsup.modules.introScreens;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by prakash-bala on 2/1/17.
 */

public class Adapter_Intro extends FragmentPagerAdapter {
    public Adapter_Intro(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return Fragment_Intro.newInstance(position);
            case 1:
                return Fragment_Intro.newInstance(position);
            case 2:
                return Fragment_Intro.newInstance(position);
            default:
                return Fragment_Intro.newInstance(position);
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}

package com.hyperkonnect.shopsup.modules.stores;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hyperkonnect.shopsup.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_StoreDetails_about extends Fragment {

    public Fragment_StoreDetails_about() {
    }

    public static Fragment_StoreDetails_about newInstance() {
        Fragment_StoreDetails_about staticPagesFragment = new Fragment_StoreDetails_about();
//        Bundle bundle = new Bundle();
//        staticPagesFragment.setArguments(bundle);
        return staticPagesFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_stores_about, container, false);
        return view;
    }

}
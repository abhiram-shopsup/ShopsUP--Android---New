package com.hyperkonnect.shopsup.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hyperkonnect.shopsup.R;


public class Fragment_Coupons extends Fragment {

    public Fragment_Coupons() {
        // Required empty public constructor
    }

     public static Fragment_Coupons newInstance(String param1, String param2) {
        Fragment_Coupons fragment = new Fragment_Coupons();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_coupons, container, false);
    }


}

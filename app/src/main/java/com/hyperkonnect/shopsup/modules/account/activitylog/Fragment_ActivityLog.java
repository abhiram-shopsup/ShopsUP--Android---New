package com.hyperkonnect.shopsup.modules.account.activitylog;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hyperkonnect.shopsup.R;
import com.hyperkonnect.shopsup.adapters.ActivityLogAdapter;
import com.hyperkonnect.shopsup.adapters.OfferAdapter;
import com.hyperkonnect.shopsup.dummydata.DummyOfferData;
import com.hyperkonnect.shopsup.model.CouponModel;
import com.hyperkonnect.shopsup.model.OfferModel;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_ActivityLog extends Fragment {
    private RecyclerView recyclerView;
    private List<OfferModel> couponList;
    private ActivityLogAdapter offerAdapter;

    public Fragment_ActivityLog() {
    }

    public static Fragment_ActivityLog newInstance() {
        Fragment_ActivityLog staticPagesFragment = new Fragment_ActivityLog();
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
        View view = inflater.inflate(R.layout.fragment_my_coupons, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        couponList = new ArrayList<>();

        offerAdapter = new ActivityLogAdapter(getContext(),couponList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getContext(), 1);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(offerAdapter);
        new DummyOfferData(couponList,offerAdapter);
        return view;
    }

}
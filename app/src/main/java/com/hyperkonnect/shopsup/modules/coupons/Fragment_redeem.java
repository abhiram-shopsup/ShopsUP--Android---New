package com.hyperkonnect.shopsup.modules.coupons;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ProgressBar;

import com.hyperkonnect.shopsup.R;
import com.hyperkonnect.shopsup.adapters.CouponAdapter;
import com.hyperkonnect.shopsup.adapters.OfferAdapter;
import com.hyperkonnect.shopsup.dummydata.DummyCouponData;
import com.hyperkonnect.shopsup.dummydata.DummyOfferData;
import com.hyperkonnect.shopsup.helper.WebViewClientHelper;
import com.hyperkonnect.shopsup.model.CouponModel;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_redeem extends Fragment {
    private static final String URL = "URL";
    private ProgressBar progress;
    private RecyclerView recyclerView;
    private List<CouponModel> couponList;
    private CouponAdapter couponAdapter;

    public Fragment_redeem() {
    }

    public static Fragment_redeem newInstance() {
        Fragment_redeem staticPagesFragment = new Fragment_redeem();
//        Bundle bundle = new Bundle();
//        bundle.putString(URL, url);
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
        View view = inflater.inflate(R.layout.fragment_redeem, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        couponList = new ArrayList<>();

        couponAdapter = new CouponAdapter(getContext(),couponList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(couponAdapter);
        new DummyCouponData(couponList,couponAdapter);
        return view;
    }

}
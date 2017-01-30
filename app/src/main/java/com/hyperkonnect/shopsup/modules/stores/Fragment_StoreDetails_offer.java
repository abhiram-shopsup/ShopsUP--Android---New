package com.hyperkonnect.shopsup.modules.stores;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hyperkonnect.shopsup.R;
import com.hyperkonnect.shopsup.adapters.OfferAdapter;
import com.hyperkonnect.shopsup.dummydata.DummyOfferData;
import com.hyperkonnect.shopsup.model.OfferModel;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_StoreDetails_offer extends Fragment {
    private RecyclerView recyclerView;
    private List<OfferModel> offerList;
    private OfferAdapter offerAdapter;

    public Fragment_StoreDetails_offer() {
    }

    public static Fragment_StoreDetails_offer newInstance() {
        Fragment_StoreDetails_offer staticPagesFragment = new Fragment_StoreDetails_offer();
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
        View view = inflater.inflate(R.layout.fragment_stores_offer, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        offerList = new ArrayList<>();

       offerAdapter = new OfferAdapter(getContext(),offerList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getContext(), 1);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(offerAdapter);
        new DummyOfferData(offerList,offerAdapter);

        return view;
    }

}
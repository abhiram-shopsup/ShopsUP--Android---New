package com.hyperkonnect.shopsup.dummydata;

import android.util.Log;

import com.hyperkonnect.shopsup.adapters.ActivityLogAdapter;
import com.hyperkonnect.shopsup.adapters.OfferAdapter;
import com.hyperkonnect.shopsup.model.OfferModel;

import java.util.List;

/**
 * Created by prakash-bala on 30/1/17.
 */

public class DummyOfferData {
    public DummyOfferData(List<OfferModel> offerList, OfferAdapter adapter){

        OfferModel offerModel = new OfferModel("Dummy Data","Ends Today");
        offerList.add(offerModel);

        offerModel = new OfferModel("Dummy Data","Ends Today");
        offerList.add(offerModel);

        offerModel = new OfferModel("Dummy Data","Ends Today");
        offerList.add(offerModel);

        offerModel = new OfferModel("Dummy Data","Ends Tomorrow");
        offerList.add(offerModel);

        adapter.notifyDataSetChanged();

    }

    public DummyOfferData(List<OfferModel> offerList, ActivityLogAdapter adapter){

        OfferModel offerModel = new OfferModel("Dummy Data","Ends Today");
        offerList.add(offerModel);

        offerModel = new OfferModel("Dummy Data","Ends Today");
        offerList.add(offerModel);

        offerModel = new OfferModel("Dummy Data","Ends Today");
        offerList.add(offerModel);

        offerModel = new OfferModel("Dummy Data","Ends Tomorrow");
        offerList.add(offerModel);

        adapter.notifyDataSetChanged();

    }
}

package com.hyperkonnect.shopsup.dummydata;

import com.hyperkonnect.shopsup.adapters.CouponAdapter;
import com.hyperkonnect.shopsup.adapters.OfferAdapter;
import com.hyperkonnect.shopsup.model.CouponModel;
import com.hyperkonnect.shopsup.model.OfferModel;

import java.util.List;

/**
 * Created by prakash-bala on 30/1/17.
 */

public class DummyCouponData {
    public DummyCouponData(List<CouponModel> couponList, CouponAdapter adapter){
//TODO
//PASS Imagge url in second parameter
        CouponModel couponModel = new CouponModel("250","here");
        couponList.add(couponModel);

        couponModel = new CouponModel("500","here");
        couponList.add(couponModel);

        couponModel = new CouponModel("1000","here");
        couponList.add(couponModel);

        couponModel = new CouponModel("100","here");
        couponList.add(couponModel);


        couponModel = new CouponModel("1000","here");
        couponList.add(couponModel);

        couponModel = new CouponModel("100","here");
        couponList.add(couponModel);

        couponModel = new CouponModel("1000","here");
        couponList.add(couponModel);

        couponModel = new CouponModel("100","here");
        couponList.add(couponModel);

        couponModel = new CouponModel("1000","here");
        couponList.add(couponModel);

        couponModel = new CouponModel("100","here");
        couponList.add(couponModel);

        adapter.notifyDataSetChanged();

    }
}

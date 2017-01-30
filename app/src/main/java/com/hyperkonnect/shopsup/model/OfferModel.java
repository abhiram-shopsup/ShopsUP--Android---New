package com.hyperkonnect.shopsup.model;

import android.util.Log;

/**
 * Created by prakash-bala on 30/1/17.
 */

public class OfferModel {
    private String offerDate;
    private String offerTitle;
    private String offerIcon;

    public OfferModel(String offerTitle, String offerDate) {
        this.offerTitle = offerTitle;
        this.offerDate = offerDate;
        //this.offerIcon = offerIcon;
    }

    public String getOfferTitle() {
        return offerTitle;
    }

    public void setOfferTitle(String offerTitle) {
        this.offerTitle = offerTitle;
    }

    public String getOfferIcon() {
        return offerIcon;
    }

    public String getOfferDate() {
        return offerDate;
    }

    public void setOfferDate(String offerDate) {
        this.offerDate = offerDate;
    }
}

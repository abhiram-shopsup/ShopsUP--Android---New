package com.hyperkonnect.shopsup.model;

/**
 * Created by prakash-bala on 30/1/17.
 */

public class CouponModel {
    private String couponShots;
    private String couponIcon;

    public CouponModel(String couponShots, String couponIcon) {
        this.couponShots = couponShots;
        this.couponIcon = couponIcon;
    }

    public String getCouponShots() {
        return couponShots;
    }

    public void setCouponShots(String couponShots) {
        this.couponShots = couponShots;
    }

    public String getCouponIcon() {
        return couponIcon;
    }

    public void setCouponIcon(String couponIcon) {
        this.couponIcon = couponIcon;
    }
}

package com.hyperkonnect.shopsup.helper.ui;

import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.util.AttributeSet;

/**
 * Created by prakash-bala on 1/2/17.
 *
 * SOME OF THE DEVICES ARE FAILING TO DRAW NATIVE DRAWER LAYOUT
 * GETTING "DrawerLayout must be measured with MeasureSpec.EXACTLY" excpetion
 * OVERRIDING DRAWER LAYOUT
 */

public class CustomDrawer extends DrawerLayout {

    public CustomDrawer(Context context) {
        super(context);
    }

    public CustomDrawer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomDrawer(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        widthMeasureSpec = MeasureSpec.makeMeasureSpec(
                MeasureSpec.getSize(widthMeasureSpec), MeasureSpec.EXACTLY);
        heightMeasureSpec = MeasureSpec.makeMeasureSpec(
                MeasureSpec.getSize(heightMeasureSpec), MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

}
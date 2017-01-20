package com.hyperkonnect.shopsup.helper;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.widget.ImageView;

import com.hyperkonnect.shopsup.R;

/**
 * Created by prakash-bala on 17/1/17.
 */

public class ShopsupUiUtils {

    public static void setRoundImage(ImageView imageView, int drawable, Context context){
        Resources res = context.getResources();
        Bitmap src = BitmapFactory.decodeResource(res, drawable);
        RoundedBitmapDrawable roundedDrawable =
                RoundedBitmapDrawableFactory.create(res, src);
        roundedDrawable.setCircular(true);
        imageView.setImageDrawable(roundedDrawable);
    }
}

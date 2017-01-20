package com.hyperkonnect.shopsup.helper;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

/**
 * Created by prakash-bala on 4/1/17.
 */

public class ShopsupUtils {
    public static boolean isNetworkConnectionAvailable(Context context) {
        //NETWORK CHECK METHOD
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = cm.getActiveNetworkInfo();
        if (info == null) return false;
        NetworkInfo.State network = info.getState();

        if (network == NetworkInfo.State.CONNECTED) {
            return true;
        } else if (network == NetworkInfo.State.CONNECTING) {
            return false;
        }
        return false;
    }

    public static void showToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}

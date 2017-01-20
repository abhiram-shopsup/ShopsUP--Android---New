package com.hyperkonnect.shopsup.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.hyperkonnect.shopsup.R;
import com.hyperkonnect.shopsup.helper.ShopsupUtils;
import com.hyperkonnect.shopsup.modules.introScreens.Activity_Intro;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;


public class Activity_Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Avenir-Book.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                try {
                    if(!ShopsupUtils.isNetworkConnectionAvailable(Activity_Splash.this)) {
                        Intent intent = new Intent(Activity_Splash.this, Activity_NoNetwork.class);
                        startActivity(intent);
                        finish();
                    }
                    else {
                        Intent intent = new Intent(Activity_Splash.this, Activity_Intro.class);
                        startActivity(intent);
                        finish();
                    }

                } catch (Exception e) {
                }
            }
        },2500);



    }

}

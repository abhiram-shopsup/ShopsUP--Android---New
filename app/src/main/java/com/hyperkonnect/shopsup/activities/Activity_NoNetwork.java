package com.hyperkonnect.shopsup.activities;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.RelativeLayout;

import com.hyperkonnect.shopsup.R;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class Activity_NoNetwork extends AppCompatActivity {
    private RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_network);
        layout = (RelativeLayout) findViewById(R.id.activity_no_network);

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_NoNetwork.this,Activity_Splash.class);
                startActivity(intent);
                finish();
            }
        });

    }
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}

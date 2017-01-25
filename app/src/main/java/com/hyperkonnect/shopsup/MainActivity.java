package com.hyperkonnect.shopsup;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;

import com.hyperkonnect.shopsup.fragments.*;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private BottomNavigationView mBottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
       toolbar.setTitle("Location Here");
           mBottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.bottom_bar_stores) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, new Fragment_Stores(), "stores").commit();
                    return true;
                }
                if (item.getItemId() == R.id.bottom_bar_coupons) {
                   getSupportFragmentManager().beginTransaction().replace(R.id.content, new Fragment_Coupons(), "coupons").commit();
                    return true;
                }
                if (item.getItemId() == R.id.bottom_bar_account) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, new Fragment_Account(), "profile").commit();
                    return true;
                }
                return false;
            }
        });
    }
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}

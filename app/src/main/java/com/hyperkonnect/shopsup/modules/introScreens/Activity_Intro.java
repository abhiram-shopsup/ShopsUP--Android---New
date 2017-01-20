package com.hyperkonnect.shopsup.modules.introScreens;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.hyperkonnect.shopsup.MainActivity;
import com.hyperkonnect.shopsup.R;
import com.rd.PageIndicatorView;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class Activity_Intro extends AppCompatActivity {

    private ViewPager mViewPager;
    private TextView startTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        startTv = (TextView) findViewById(R.id.start);

        // Set an Adapter on the ViewPager
        mViewPager.setAdapter(new Adapter_Intro(getSupportFragmentManager()));

        // Set a PageTransformer
        // mViewPager.setPageTransformer(false, new IntroPageTransformer());
        PageIndicatorView pageIndicatorView = (PageIndicatorView)findViewById(R.id.pageIndicatorView);
        pageIndicatorView.setViewPager(mViewPager);
        pageIndicatorView.setSelectedColor(getResources().getColor(R.color.white));
        pageIndicatorView.setUnselectedColor(getResources().getColor(R.color.black20pc));

        startTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_Intro.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}

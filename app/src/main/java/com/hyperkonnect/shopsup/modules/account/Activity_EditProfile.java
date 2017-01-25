package com.hyperkonnect.shopsup.modules.account;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;

import com.hyperkonnect.shopsup.R;
import com.hyperkonnect.shopsup.helper.ShopsupUiUtils;

public class Activity_EditProfile extends AppCompatActivity {

    private Toolbar toolbar;
    private ImageView profileImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        toolbar.setTitle(getResources().getString(R.string.edit_profile));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        profileImage = (ImageView)findViewById(R.id.profileImage);

        ShopsupUiUtils.setRoundImage(profileImage,R.drawable.bckk,this);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

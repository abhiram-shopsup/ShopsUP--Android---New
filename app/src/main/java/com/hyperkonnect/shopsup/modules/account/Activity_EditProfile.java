package com.hyperkonnect.shopsup.modules.account;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
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
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        toolbar.setTitle("Edit Profile");
        profileImage = (ImageView)findViewById(R.id.profileImage);

        ShopsupUiUtils.setRoundImage(profileImage,R.drawable.bckk,this);
    }
}

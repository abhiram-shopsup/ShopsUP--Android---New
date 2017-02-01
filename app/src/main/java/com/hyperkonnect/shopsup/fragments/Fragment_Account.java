package com.hyperkonnect.shopsup.fragments;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hyperkonnect.shopsup.modules.account.Activity_Terms;
import com.hyperkonnect.shopsup.modules.account.activitylog.Activity_ActivityLog;
import com.hyperkonnect.shopsup.modules.account.Activity_ContactUs;
import com.hyperkonnect.shopsup.modules.account.Activity_EditProfile;
import com.hyperkonnect.shopsup.R;
import com.hyperkonnect.shopsup.helper.ShopsupUiUtils;
import com.hyperkonnect.shopsup.modules.account.more.Activity_More;


public class Fragment_Account extends Fragment {
    private TextView activityLog,editProfileTV,contactUsTV,terms,more;
    private ImageView profileImage;
    public Fragment_Account() {
        // Required empty public constructor
    }

     public static Fragment_Account newInstance(String param1, String param2) {
        Fragment_Account fragment = new Fragment_Account();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        profileImage = (ImageView) view.findViewById(R.id.profileImage);

        activityLog = (TextView)view.findViewById(R.id.activityLog);
        editProfileTV = (TextView) view.findViewById(R.id.editProfile);
        contactUsTV = (TextView) view.findViewById(R.id.contact);
        terms = (TextView) view.findViewById(R.id.terms);
        more = (TextView) view.findViewById(R.id.more);

        //Rounded imageview
        ShopsupUiUtils.setRoundImage(profileImage,R.drawable.bckk,getContext());
        activityLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Activity_ActivityLog.class);
                Log.i("animationimage","Working");
                startActivity(intent);
            }
        });

        editProfileTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options = ActivityOptions
                            .makeSceneTransitionAnimation(getActivity(), profileImage, "profileImage");
                    Intent intent = new Intent(getActivity(), Activity_EditProfile.class);
                    Log.i("animationimage","Working");
                    startActivity(intent,options.toBundle());
                }
                else {
                    Intent intent = new Intent(getActivity(), Activity_EditProfile.class);
                    startActivity(intent);
                }
            }
        });

        contactUsTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Activity_ContactUs.class);
                startActivity(intent);
            }
        });

        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), Activity_Terms.class);
                    startActivity(intent);
            }
        });

        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Activity_More.class);
                startActivity(intent);
            }
        });

        return view;
    }


}

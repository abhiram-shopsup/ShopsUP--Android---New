package com.hyperkonnect.shopsup.fragments;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.hyperkonnect.shopsup.R;
import com.hyperkonnect.shopsup.helper.ui.CustomDrawer;
import com.hyperkonnect.shopsup.modules.coupons.Fragment_MyCoupons;
import com.hyperkonnect.shopsup.modules.coupons.Fragment_redeem;

import java.util.ArrayList;
import java.util.List;


public class Fragment_Coupons extends Fragment {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private ImageView imageView;
    private CustomDrawer drawer;

    public Fragment_Coupons() {
        // Required empty public constructor
    }

     public static Fragment_Coupons newInstance(String param1, String param2) {
        Fragment_Coupons fragment = new Fragment_Coupons();
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
        View view = inflater.inflate(R.layout.fragment_coupons, container, false);
        imageView = (ImageView)view.findViewById(R.id.filter);
        viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) view.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        drawer = (CustomDrawer) view.findViewById(R.id.drawer_layout);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.openDrawer(Gravity.RIGHT);

            }

        });


        return view;

    }
    private void setupViewPager(ViewPager viewPager) {
        Fragment_Coupons.ViewPagerAdapter adapter = new Fragment_Coupons.ViewPagerAdapter(getChildFragmentManager());
        adapter.addFragment(Fragment_redeem.newInstance(), "redeem");
        adapter.addFragment(Fragment_MyCoupons.newInstance(), "coupons");
        viewPager.setAdapter(adapter);
    }


    class ViewPagerAdapter extends FragmentPagerAdapter {
        private static final String TAG = "ViewPagerAdapter";
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}

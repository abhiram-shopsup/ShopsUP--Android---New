package com.hyperkonnect.shopsup.fragments;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;

import com.hyperkonnect.shopsup.R;
import com.hyperkonnect.shopsup.adapters.ExpandableListAdapter;
import com.hyperkonnect.shopsup.dummydata.DummyFilterData;
import com.hyperkonnect.shopsup.helper.ui.CustomDrawer;
import com.hyperkonnect.shopsup.modules.coupons.Fragment_MyCoupons;
import com.hyperkonnect.shopsup.modules.coupons.Fragment_redeem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Fragment_Stores extends Fragment {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private ImageView imageView;
    private CustomDrawer drawer;
    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;

    public Fragment_Stores() {
        // Required empty public constructor
    }

     public static Fragment_Stores newInstance(String param1, String param2) {
        Fragment_Stores fragment = new Fragment_Stores();
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
        View view = inflater.inflate(R.layout.fragment_stores, container, false);

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
        drawer = (CustomDrawer) view.findViewById(R.id.drawer_layout);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.openDrawer(Gravity.RIGHT);

            }

        });
        expListView = (ExpandableListView) view.findViewById(R.id.lvExp);
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // preparing list data
        DummyFilterData.prepareListData(listDataHeader,listDataChild);

        listAdapter = new ExpandableListAdapter(getActivity(), listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        // Listview Group click listener
        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
//                Toast.makeText(getActivity().getApplicationContext(),
//                        listDataHeader.get(groupPosition) + " Expanded",
//                        Toast.LENGTH_SHORT).show();
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
//                Toast.makeText(
//                        getActivity().getApplicationContext(),
//                        listDataHeader.get(groupPosition)
//                                + " : "
//                                + listDataChild.get(
//                                listDataHeader.get(groupPosition)).get(
//                                childPosition), Toast.LENGTH_SHORT)
//                        .show();
                return false;
            }
        });

        return view;
    }

    private void setupViewPager(ViewPager viewPager) {
        Fragment_Stores.ViewPagerAdapter adapter = new Fragment_Stores.ViewPagerAdapter(getChildFragmentManager());
        adapter.addFragment(Fragment_redeem.newInstance(), "Brands");
        adapter.addFragment(Fragment_MyCoupons.newInstance(), "Stores");
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

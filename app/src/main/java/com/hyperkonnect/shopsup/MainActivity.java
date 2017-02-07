package com.hyperkonnect.shopsup;


import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.hyperkonnect.shopsup.activities.Activity_ChangeLocation;
import com.hyperkonnect.shopsup.adapters.ExpandableListAdapter;
import com.hyperkonnect.shopsup.dummydata.DummyFilterData;
import com.hyperkonnect.shopsup.fragments.*;
import com.hyperkonnect.shopsup.helper.ShopsupUiUtils;
import com.hyperkonnect.shopsup.helper.ui.CustomDrawer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView mBottomNavigationView;
    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;
    private CustomDrawer drawer;
//    private TextView changeLocationTv,shotsIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.content, new Fragment_Stores(), "stores").commit();
           mBottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        drawer = (CustomDrawer) findViewById(R.id.drawer_layout_main);
        drawer.setDrawerLockMode(CustomDrawer.LOCK_MODE_LOCKED_CLOSED);
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


        expListView = (ExpandableListView) findViewById(R.id.lvExp);
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // preparing list data
        DummyFilterData.prepareListData(listDataHeader,listDataChild);

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

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
    }


    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}

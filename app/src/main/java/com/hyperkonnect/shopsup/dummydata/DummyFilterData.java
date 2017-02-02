package com.hyperkonnect.shopsup.dummydata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by prakash-bala on 2/2/17.
 */

public class DummyFilterData {

    public static void prepareListData(List<String> list,HashMap<String,List<String>> listDataChild) {


        // Adding child data

        list.add("Men");
        list.add("Women");
        list.add("Kids");

        // Adding child data
        List<String> men = new ArrayList<String>();
        men.add("Ethnic");
        men.add("Formals");
        men.add("Footwear");
        men.add("Others");

        List<String> women = new ArrayList<String>();
        women.add("Ethnic");
        women.add("Formals");
        women.add("Footwear");
        women.add("Others");

        List<String> kids = new ArrayList<String>();

        listDataChild.put(list.get(0), men); // Header, Child data
        listDataChild.put(list.get(1), women);
        listDataChild.put(list.get(2), kids);
    }
}

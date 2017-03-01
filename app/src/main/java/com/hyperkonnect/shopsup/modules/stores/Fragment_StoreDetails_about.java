package com.hyperkonnect.shopsup.modules.stores;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.flexbox.FlexboxLayout;
import com.hyperkonnect.shopsup.R;
import com.hyperkonnect.shopsup.helper.ui.TagView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_StoreDetails_about extends Fragment {
    private FlexboxLayout tagView;
    private TextView mapView;

    public Fragment_StoreDetails_about() {
    }

    public static Fragment_StoreDetails_about newInstance() {
        Fragment_StoreDetails_about staticPagesFragment = new Fragment_StoreDetails_about();
//        Bundle bundle = new Bundle();
//        staticPagesFragment.setArguments(bundle);
        return staticPagesFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        String address = getResources().getString(R.string.dummy_address)+"<br/><font color=#ff9a00><u>view in map</u></font>";
        View view = inflater.inflate(R.layout.fragment_stores_about, container, false);
        tagView = (FlexboxLayout) view.findViewById(R.id.tagView);
        mapView = (TextView)view.findViewById(R.id.viewinmap);
        mapView.setText(Html.fromHtml(address));
        for(int i=0;i<=5;i++) {
            TagView tagViewTV = new TagView(getContext());
            tagViewTV.setText("kids");
            tagView.addView(tagViewTV);
            Log.i("tagviewid",tagViewTV.getId()+"");
        }

        return view;
    }

}
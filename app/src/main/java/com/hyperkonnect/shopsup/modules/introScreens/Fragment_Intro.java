package com.hyperkonnect.shopsup.modules.introScreens;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.hyperkonnect.shopsup.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Intro extends Fragment {
    private static final String BACKGROUND_COLOR = "backgroundColor";
    private static final String PAGE = "page";
    private int  mPage;


    public Fragment_Intro() {
        // Required empty public constructor
    }
    public static Fragment_Intro newInstance(int page) {
        Fragment_Intro frag = new Fragment_Intro();
        Bundle b = new Bundle();
        b.putInt(PAGE, page);
        frag.setArguments(b);
        return frag;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!getArguments().containsKey(PAGE))
            throw new RuntimeException("Fragment must contain a \"" + PAGE + "\" argument!");
        mPage = getArguments().getInt(PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Select a layout based on the current page
        int layoutResId;
        Drawable image;
        String title;
        String shortTitle;
        switch (mPage) {
//            case 0:
//                layoutResId = R.layout.intro_fragment_layout_1;
//                break;
            default:
                layoutResId = R.layout.fragment_intro;
        }

        // Inflate the layout resource file
        View view = getActivity().getLayoutInflater().inflate(layoutResId, container, false);

        // Set the current page index as the View's tag (useful in the PageTransformer)
        view.setTag(mPage);

        switch (mPage) {
            case 0:
                title = getString(R.string.intro_title_one);
                shortTitle = getString(R.string.intro_desc_one);
                image = getResources().getDrawable(R.drawable.walkin_icon);
                break;
            case 1:
                title = getString(R.string.intro_title_two);
                shortTitle = getString(R.string.intro_desc_two);
                image = getResources().getDrawable(R.drawable.earn_shots_icon);
                break;
            case 2:
                title = getString(R.string.intro_title_three);
                shortTitle = getString(R.string.intro_desc_three);
                image = getResources().getDrawable(R.drawable.reedeem_icon);
                break;
            default:
                title = getString(R.string.intro_title_one);
                shortTitle = getString(R.string.intro_desc_one);
                image = getResources().getDrawable(R.drawable.amazon);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.tv);
        TextView titleTV = (TextView) view.findViewById(R.id.title);
        TextView shortTitleTV = (TextView) view.findViewById(R.id.shortTitle);
        titleTV.setText(title);
        shortTitleTV.setText(shortTitle);
        imageView.setImageDrawable(image);
        return view;
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Set the background color of the root view to the color specified in newInstance()
        View background = view.findViewById(R.id.intro_background);
        background.setBackground(getResources().getDrawable(R.drawable.bg));
    }

}

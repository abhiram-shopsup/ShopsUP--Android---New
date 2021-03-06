package com.hyperkonnect.shopsup.modules.account.more;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ProgressBar;

import com.hyperkonnect.shopsup.R;
import com.hyperkonnect.shopsup.helper.WebViewClientHelper;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_More extends Fragment {
    private static final String URL = "URL";
    private ProgressBar progress;

    public Fragment_More() {
    }

    public static Fragment_More newInstance(String url) {
        Fragment_More staticPagesFragment = new Fragment_More();
        Bundle bundle = new Bundle();
        bundle.putString(URL, url);
        staticPagesFragment.setArguments(bundle);
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
        View view = inflater.inflate(R.layout.fragment_webview, container, false);
        String url = getArguments().getString(URL);
        progress = (ProgressBar)view.findViewById(R.id.progressBar);
        WebView wv = (WebView) view.findViewById(R.id.webView);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new WebViewClientHelper(progress));
        wv.loadUrl(url);
        return view;
    }

}
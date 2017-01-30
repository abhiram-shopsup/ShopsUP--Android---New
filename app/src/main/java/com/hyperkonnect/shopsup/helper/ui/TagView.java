package com.hyperkonnect.shopsup.helper.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hyperkonnect.shopsup.R;

/**
 * Created by prakash-bala on 30/1/17.
 */

public class TagView extends LinearLayout {
    private Context context;

    public TagView(Context context) {
        super(context);
        this.context = context;
    }

    public TagView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        initViews(context, attrs);
    }

    public void setText(String string) {
        LayoutInflater.from(context).inflate(R.layout.widget_tag, this);
        TextView textView = (TextView) this.findViewById(R.id.tag_text);
        textView.setText(string);
    }


    private void initViews(Context context, AttributeSet attrs) {
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.TagView, 0, 0);
        String titleText = "";
        try {
            titleText = a.getString(R.styleable.TagView_text);
        } finally {
            a.recycle();
        }
        setText(titleText);
    }
}
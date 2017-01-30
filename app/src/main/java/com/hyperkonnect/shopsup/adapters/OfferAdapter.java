package com.hyperkonnect.shopsup.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hyperkonnect.shopsup.R;
import com.hyperkonnect.shopsup.model.OfferModel;

import java.util.List;

/**
 * Created by prakash-bala on 30/1/17.
 */

public class OfferAdapter extends RecyclerView.Adapter<OfferAdapter.MyViewHolder> {

    private Context mContext;
    private List<OfferModel> offerList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, date;
        public ImageView thumbnail;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            date = (TextView) view.findViewById(R.id.date);
            thumbnail = (ImageView) view.findViewById(R.id.image);
        }
    }


    public OfferAdapter(Context mContext, List<OfferModel> offerList) {
        this.mContext = mContext;
        this.offerList = offerList;
        Log.i("offerTitle","here");
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.store_offer_card, parent, false);

        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        OfferModel offerModel = offerList.get(position);
        holder.title.setText(offerModel.getOfferTitle());
        holder.date.setText(offerModel.getOfferDate());

        Log.i("offerTitle",offerModel.getOfferTitle());

        // loading album cover using Glide library
        //.with(mContext).load(album.getThumbnail()).into(holder.thumbnail);
    }

    @Override
    public int getItemCount() {
         return offerList.size();
    }
}
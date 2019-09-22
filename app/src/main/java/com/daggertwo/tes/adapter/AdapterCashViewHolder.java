package com.daggertwo.tes.adapter;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.daggertwo.tes.R;

class AdapterCashViewHolder extends RecyclerView.ViewHolder {
    private TextView tvPrice;
    private TextView tvDate;
    private TextView tvTitle;
    private TextView tvTime;
    private LinearLayout llCard;
    private ImageView ivCash;
    public AdapterCashViewHolder(@NonNull View itemView) {
        super(itemView);
        tvPrice = itemView.findViewById(R.id.AdapterCashtvPrice);
        tvTime = itemView.findViewById(R.id.AdapterCashtvTime);
        tvTitle = itemView.findViewById(R.id.AdapterCashtvTitle);
        ivCash = itemView.findViewById(R.id.AdapterCashivIcon);
        tvDate = itemView.findViewById(R.id.AdapterCashtvDate);
        llCard = itemView.findViewById(R.id.AdapterCardBorder);
    }

    public void setTvPrice(String tvPrice) {
        this.tvPrice.setText(tvPrice);
    }

    public void setTvDate(String tvDate) {
        this.tvDate.setText(tvDate);
    }

    public void setTvTitle(String tvTitle) {
        this.tvTitle.setText(tvTitle);
    }

    public void setTvTime(String tvTime) {
        this.tvTime.setText(tvTime);
    }

    public void setBackground(boolean val){
        if(val){
            ivCash.setBackgroundResource(R.drawable.ic_receive_cash);
            llCard.setBackgroundResource(R.color.colorGreen);
        }else {
            ivCash.setBackgroundResource(R.drawable.ic_expend_cash);
            llCard.setBackgroundResource(R.color.colorPrimary);
        }
    }

    public void setBorder(boolean val){
    }
}

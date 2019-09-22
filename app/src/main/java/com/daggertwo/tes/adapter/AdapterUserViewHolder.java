package com.daggertwo.tes.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.daggertwo.tes.R;

class AdapterUserViewHolder extends RecyclerView.ViewHolder {
    private TextView tvUsername;
    private TextView tvDesc;
    private ImageView ivDetails;
    private LinearLayout llData;
    public AdapterUserViewHolder(@NonNull View itemView) {
        super(itemView);
        tvUsername = itemView.findViewById(R.id.tvLayoutUserUsername);
        tvDesc = itemView.findViewById(R.id.tvLayoutUserDesc);
        ivDetails = itemView.findViewById(R.id.ivLayoutUserClick);
        llData = itemView.findViewById(R.id.llLayoutUser);
    }

    public void setTvUsername(String tvUsername) {
        this.tvUsername.setText(tvUsername);
    }

    public void setTvDesc(String tvDesc) {
        this.tvDesc.setText(tvDesc);
    }

    public LinearLayout getLlData() {
        return llData;
    }
}

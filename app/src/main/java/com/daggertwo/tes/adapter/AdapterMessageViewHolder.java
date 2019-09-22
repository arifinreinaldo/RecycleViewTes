package com.daggertwo.tes.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.daggertwo.tes.R;

class AdapterMessageViewHolder extends RecyclerView.ViewHolder {
    private TextView tvTitle,tvMessage;

    public void setTvTitle(String value) {
        this.tvTitle.setText(value);
    }

    public void setTvMessage(String value) {
        this.tvMessage.setText(value);
    }
    public AdapterMessageViewHolder(@NonNull View itemView) {
        super(itemView);
        tvTitle = itemView.findViewById(R.id.title_message);
        tvMessage = itemView.findViewById(R.id.body_message);
    }
}

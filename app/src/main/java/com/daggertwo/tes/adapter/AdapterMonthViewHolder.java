package com.daggertwo.tes.adapter;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.daggertwo.tes.R;

class AdapterMonthViewHolder extends RecyclerView.ViewHolder {
    private TextView upperHolder;
    private TextView bottomHolder;
    private View itemView;
    public AdapterMonthViewHolder(@NonNull View itemView) {
        super(itemView);
        upperHolder = itemView.findViewById(R.id.upperText);
        bottomHolder = itemView.findViewById(R.id.bottomText);
//        itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
        this.itemView = itemView;
    }
    public void setUpper(String text){
        upperHolder.setText(text);
    }
    public void setBottm(String text){
        bottomHolder.setText(text);
    }
    public View getView(){
        return itemView;
    }
    public void setBackground(boolean val,boolean isDisabled){
        upperHolder.setTextColor(Color.parseColor("#FFFFFF"));
        bottomHolder.setTextColor(Color.parseColor("#FFFFFF"));
        if(isDisabled){
            itemView.setBackgroundResource(R.drawable.rounded_corner_disabled);
        }else {
            if (val) {
                itemView.setBackgroundResource(R.drawable.rounded_corner_selected);
            } else {
                itemView.setBackgroundResource(R.drawable.rounded_corner);
                upperHolder.setTextColor(Color.parseColor("#000000"));
                bottomHolder.setTextColor(Color.parseColor("#000000"));
            }
        }
    }
}

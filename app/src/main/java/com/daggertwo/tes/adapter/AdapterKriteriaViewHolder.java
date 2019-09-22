package com.daggertwo.tes.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.daggertwo.tes.R;

class AdapterKriteriaViewHolder extends RecyclerView.ViewHolder {
    private TextView tvKriteria,tvPoin,tvInsentif,tvHasil;
    public AdapterKriteriaViewHolder(@NonNull View itemView) {
        super(itemView);
        tvKriteria = itemView.findViewById(R.id.rvCritKriteria);
        tvHasil = itemView.findViewById(R.id.rvCritHasil);
        tvInsentif = itemView.findViewById(R.id.rvCritInsentif);
        tvPoin = itemView.findViewById(R.id.rvCritPoin);
    }

    public void setTvKriteria(String tvKriteria) {
        this.tvKriteria.setText(tvKriteria);
    }

    public void setTvPoin(String tvPoin) {
        this.tvPoin.setText(tvPoin);
    }

    public void setTvInsentif(String tvInsentif) {
        this.tvInsentif.setText(tvInsentif);
    }

    public void setTvHasil(String tvHasil) {
        this.tvHasil.setText(tvHasil);
    }
}

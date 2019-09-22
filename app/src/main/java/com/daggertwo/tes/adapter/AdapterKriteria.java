package com.daggertwo.tes.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daggertwo.tes.R;
import com.daggertwo.tes.model.PojoCrit;

import java.util.List;

public class AdapterKriteria extends RecyclerView.Adapter<AdapterKriteriaViewHolder> {
    private Context ctx;
    private List<PojoCrit> listPicker;

    public AdapterKriteria(Context ctx, List<PojoCrit> listPicker) {
        this.ctx = ctx;
        this.listPicker = listPicker;
    }

    @NonNull
    @Override
    public AdapterKriteriaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_kriteria, viewGroup, false);
        return new AdapterKriteriaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterKriteriaViewHolder adapterKriteriaViewHolder, int i) {
        PojoCrit productObject = listPicker.get(i);
        adapterKriteriaViewHolder.setTvHasil(productObject.getHasil());
        adapterKriteriaViewHolder.setTvInsentif(productObject.getInsentif());
        adapterKriteriaViewHolder.setTvKriteria(productObject.getKriteria());
        adapterKriteriaViewHolder.setTvPoin(productObject.getPoin());
    }

    @Override
    public int getItemCount() {
        return listPicker.size();
    }
}

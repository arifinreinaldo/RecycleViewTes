package com.daggertwo.tes.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daggertwo.tes.R;
import com.daggertwo.tes.model.PojoUang;

import java.util.List;

public class AdapterCash extends RecyclerView.Adapter<AdapterCashViewHolder> {
    private Context ctx;
    private List<PojoUang> listUang;

    public AdapterCash(Context ctx, List<PojoUang> listUang) {
        this.ctx = ctx;
        this.listUang = listUang;
    }

    @NonNull
    @Override
    public AdapterCashViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_cash_expends, viewGroup, false);
        return new AdapterCashViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterCashViewHolder adapterCashViewHolder, int i) {
        final PojoUang object = listUang.get(i);
        adapterCashViewHolder.setBackground(object.isInout());
        adapterCashViewHolder.setTvPrice("Rp "+object.getCash());
        adapterCashViewHolder.setTvDate(object.getDate());
        adapterCashViewHolder.setTvTitle(object.getTitle());
    }

    @Override
    public int getItemCount() {
        return listUang.size();
    }
}

package com.daggertwo.tes.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daggertwo.tes.R;
import com.daggertwo.tes.model.PojoMessage;

import java.util.ArrayList;

public class AdapterMessage extends RecyclerView.Adapter<AdapterMessageViewHolder> {
    ArrayList<PojoMessage>pojoMessages = new ArrayList<>();
    private Context ctx;

    public AdapterMessage(ArrayList<PojoMessage> pojoMessages, Context ctx) {
        this.pojoMessages = pojoMessages;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public AdapterMessageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_message, viewGroup, false);
        return new AdapterMessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterMessageViewHolder adapterMessageViewHolder, int i) {
        final PojoMessage object = pojoMessages.get(i);
        adapterMessageViewHolder.setTvTitle(object.getTitle());
        adapterMessageViewHolder.setTvMessage(object.getBody());
    }

    @Override
    public int getItemCount() {
        return pojoMessages.size();
    }
}

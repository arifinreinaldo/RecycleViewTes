package com.daggertwo.tes.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daggertwo.tes.R;
import com.daggertwo.tes.explore.UserActivityListener;
import com.daggertwo.tes.model.PojoUser;

import java.util.ArrayList;

public class AdapterUser extends RecyclerView.Adapter<AdapterUserViewHolder> {
    ArrayList<PojoUser> pojoUsers;
    Context ctx;
    UserActivityListener listener;


    public AdapterUser(ArrayList<PojoUser> pojoUsers, Context ctx, UserActivityListener listener) {
        this.pojoUsers = pojoUsers;
        this.ctx = ctx;
        this.listener = listener;
    }

    @NonNull
    @Override
    public AdapterUserViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_user,viewGroup,false);
        return new AdapterUserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterUserViewHolder adapterUserViewHolder, int i) {
        adapterUserViewHolder.setTvUsername(pojoUsers.get(i).getUsername());
        adapterUserViewHolder.setTvDesc(pojoUsers.get(i).getType()+" - "+pojoUsers.get(i).getPlate_no());
        adapterUserViewHolder.getLlData().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.callDashboard();
            }
        });
    }

    @Override
    public int getItemCount() {
        return pojoUsers.size();
    }
}

package com.daggertwo.tes.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daggertwo.tes.R;
import com.daggertwo.tes.model.PojoAchievement;

import java.util.ArrayList;

public class AdapterAchievement extends RecyclerView.Adapter<AdapterAchievementViewHolder> {
    ArrayList<PojoAchievement> pojoAchievements = new ArrayList<>();
    @NonNull
    @Override
    public AdapterAchievementViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_achievement, viewGroup, false);
        return new AdapterAchievementViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterAchievementViewHolder adapterAchievementViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return pojoAchievements.size();
    }
}

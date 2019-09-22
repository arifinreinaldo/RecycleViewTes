package com.daggertwo.tes.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daggertwo.tes.MainActivityImp;
import com.daggertwo.tes.model.PojoPicker;
import com.daggertwo.tes.R;

import java.util.List;

public class AdapterMonth extends RecyclerView.Adapter<AdapterMonthViewHolder> {
    private Context ctx;
    private List<PojoPicker> listPicker;
    private MainActivityImp listener;
    public AdapterMonth(Context context, List<PojoPicker> value,MainActivityImp listen){
        this.ctx = context;
        listPicker = value;
        this.listener = listen;
    }

    @NonNull
    @Override
    public AdapterMonthViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_picker, viewGroup, false);
        return new AdapterMonthViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final AdapterMonthViewHolder adapterMonthViewHolder, int i) {
        final PojoPicker productObject = listPicker.get(i);
        adapterMonthViewHolder.setUpper(productObject.getUpperText());
        adapterMonthViewHolder.setBottm(productObject.getBottomText());
        adapterMonthViewHolder.setBackground(productObject.getSelected(),productObject.isDisabled());
        adapterMonthViewHolder.getView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!productObject.isDisabled()) {
                    setSelectedPosition(productObject.getIndex());
                    listener.loadDaily();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPicker.size();
    }

    public void setSelectedPosition(int position) {
        for (int i = 0; i < listPicker.size(); i++) {
            listPicker.get(i).setSelected(i == position);
        }
        notifyDataSetChanged();
    }
}

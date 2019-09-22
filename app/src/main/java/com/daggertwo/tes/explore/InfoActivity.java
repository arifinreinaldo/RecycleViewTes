package com.daggertwo.tes.explore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.daggertwo.tes.MainActivityImp;
import com.daggertwo.tes.R;
import com.daggertwo.tes.adapter.AdapterKriteria;
import com.daggertwo.tes.adapter.AdapterMonth;
import com.daggertwo.tes.model.PojoCrit;
import com.daggertwo.tes.model.PojoPicker;

import java.util.ArrayList;
import java.util.List;

public class InfoActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        hideInfo();
        setTvTitle("Informasi");

    }

}

package com.daggertwo.tes.explore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.daggertwo.tes.R;
import com.daggertwo.tes.adapter.AdapterMonth;

public class AchievementActivity extends BaseActivity {
    private RecyclerView rvAchievement;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievement);
        rvAchievement = findViewById(R.id.rvAchievement);
//        LinearLayoutManager layoutManagerWeekly
//                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//        rvAchievement.setLayoutManager(layoutManagerWeekly);
//
//
//        rvAchievement.setAdapter(mAdapterdweekly);

    }
}

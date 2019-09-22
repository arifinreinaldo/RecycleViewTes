package com.daggertwo.tes.explore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
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

public class RiwayatActivity extends BaseActivity implements MainActivityImp {
    private RecyclerView rvDate;
    private RecyclerView rvKriteriaDate;
    private RecyclerView rvWeekly;
    private RecyclerView rvKriteriaWeek;
    private RecyclerView rvYear;
    private RecyclerView rvKriteriaYear;
    private MainActivityImp loadData;
    private LinearLayout llDaily;
    private TextView tvTotal;
    private List<PojoCrit> contentDaily;
    private AdapterKriteria mKriteria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat);
        rvDate = findViewById(R.id.rvDates);
        rvKriteriaDate = findViewById(R.id.rvKriteriaDates);
        rvWeekly = findViewById(R.id.rvWeeks);
        rvKriteriaWeek = findViewById(R.id.rvKriteriaWeeks);
        rvYear = findViewById(R.id.rvYears);
        rvKriteriaYear = findViewById(R.id.rvKriteriaYear);
        llDaily = findViewById(R.id.kriteria_daily);
        tvTotal = llDaily.findViewById(R.id.rvCritPoin);

        LinearLayoutManager layoutManagerDay
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        layoutManagerDay.setReverseLayout(true);
        rvDate.setLayoutManager(layoutManagerDay);
        AdapterMonth mAdapter = new AdapterMonth(RiwayatActivity.this, getDailyData(), this);
        rvDate.setAdapter(mAdapter);


        LinearLayoutManager layoutManagerDayVerti
                = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvKriteriaDate.setLayoutManager(layoutManagerDayVerti);
        contentDaily = getKriteria();
        mKriteria = new AdapterKriteria(this, contentDaily);
        rvKriteriaDate.setAdapter(mKriteria);


        LinearLayoutManager layoutManagerWeekly
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rvWeekly.setLayoutManager(layoutManagerWeekly);
        SnapHelper helper = new LinearSnapHelper();
        helper.attachToRecyclerView(rvWeekly);
        AdapterMonth mAdapterdweekly = new AdapterMonth(RiwayatActivity.this, getWeeklyMTD(),this);
        rvWeekly.setAdapter(mAdapterdweekly);

        LinearLayoutManager layoutManagerdWeeklyVerti
                = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvKriteriaWeek.setLayoutManager(layoutManagerdWeeklyVerti);
        AdapterKriteria mKriteriadWeek = new AdapterKriteria(RiwayatActivity.this, getKriteria());
        rvKriteriaWeek.setAdapter(mKriteriadWeek);

        LinearLayoutManager layoutManagerdYear
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rvYear.setLayoutManager(layoutManagerdYear);
        AdapterMonth mAdapterdYear = new AdapterMonth(RiwayatActivity.this, getMontlyMTD(),this);
        rvYear.setAdapter(mAdapterdYear);

        LinearLayoutManager layoutManagerdYearVerti
                = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvKriteriaYear.setLayoutManager(layoutManagerdYearVerti);
        AdapterKriteria mKriteriadYear = new AdapterKriteria(RiwayatActivity.this, getKriteria());
        rvKriteriaYear.setAdapter(mKriteriadYear);
    }


    private List<PojoPicker> getDailyData() {
        List<PojoPicker> featuredProducts = new ArrayList<PojoPicker>();
        featuredProducts.add(new PojoPicker("26", "Juni", 0, true));
        featuredProducts.add(new PojoPicker("25", "Juni", 1));
        featuredProducts.add(new PojoPicker("24", "Juni", 2));
        featuredProducts.add(new PojoPicker("23", "Juni", 3));
        featuredProducts.add(new PojoPicker("22", "Juni", 4));
        featuredProducts.add(new PojoPicker("21", "Juni", 5));
        featuredProducts.add(new PojoPicker("20", "Juni", 6));
        featuredProducts.add(new PojoPicker("19", "Juni", 7));
        featuredProducts.add(new PojoPicker("18", "Juni", 8));
        featuredProducts.add(new PojoPicker("17", "Juni", 9));
        featuredProducts.add(new PojoPicker("16", "Juni", 10));
        return featuredProducts;
    }

    private List<PojoCrit> getKriteria() {
        List<PojoCrit> featuredProducts = new ArrayList<PojoCrit>();
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38", "4", "4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38", "4", "4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38", "4", "4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38", "4", "4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38", "4", "4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38", "4", "4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38", "4", "4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38", "4", "4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38", "4", "4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38", "4", "4000"));
        return featuredProducts;
    }


    private List<PojoCrit> getKriteria2() {
        List<PojoCrit> featuredProducts = new ArrayList<PojoCrit>();
        featuredProducts.add(new PojoCrit("Swine", "07:38", "4", "4000"));
        featuredProducts.add(new PojoCrit("Swine", "07:38", "4", "4000"));
        featuredProducts.add(new PojoCrit("Swine", "07:38", "4", "4000"));
        featuredProducts.add(new PojoCrit("Swine", "07:38", "4", "4000"));
        featuredProducts.add(new PojoCrit("Swine", "07:38", "4", "4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38", "4", "4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38", "4", "4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38", "4", "4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38", "4", "4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38", "4", "4000"));
        return featuredProducts;
    }

    private List<PojoPicker> getWeeklyMTD() {
        List<PojoPicker> featuredProducts = new ArrayList<PojoPicker>();
        featuredProducts.add(new PojoPicker("1", "Minggu", 0));
        featuredProducts.add(new PojoPicker("2", "Minggu", 1,true));
        featuredProducts.add(new PojoPicker("3", "Minggu", 2));
        featuredProducts.add(new PojoPicker("4", "Minggu", 3));
        return featuredProducts;
    }


    private List<PojoPicker> getMontlyMTD() {
        List<PojoPicker> featuredProducts = new ArrayList<PojoPicker>();
        featuredProducts.add(new PojoPicker("Jan", "2019",0));
        featuredProducts.add(new PojoPicker("Feb", "2019",1,true,false));
        featuredProducts.add(new PojoPicker("Mar", "2019",2,false,true));
        featuredProducts.add(new PojoPicker("Apr", "2019",3,false,true));
        featuredProducts.add(new PojoPicker("May", "2019",4,false,true));
        featuredProducts.add(new PojoPicker("Jun", "2019",5,false,true));
        featuredProducts.add(new PojoPicker("Jul", "2019",6,false,true));
        featuredProducts.add(new PojoPicker("Aug", "2019",7,false,true));
        featuredProducts.add(new PojoPicker("Sep", "2019",8,false,true));
        featuredProducts.add(new PojoPicker("Oct", "2019",9,false,true));
        featuredProducts.add(new PojoPicker("Nov", "2019",10,false,true));
        featuredProducts.add(new PojoPicker("Dec", "2019",11,false,true));
        return featuredProducts;
    }

    @Override
    public void loadDaily() {

    }
}

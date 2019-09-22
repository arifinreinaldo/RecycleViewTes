package com.daggertwo.tes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.daggertwo.tes.adapter.AdapterCash;
import com.daggertwo.tes.adapter.AdapterKriteria;
import com.daggertwo.tes.adapter.AdapterMonth;
import com.daggertwo.tes.explore.SwipeActivity;
import com.daggertwo.tes.model.Bolton;
import com.daggertwo.tes.model.Cash;
import com.daggertwo.tes.model.PojoCrit;
import com.daggertwo.tes.model.PojoPicker;
import com.daggertwo.tes.model.PojoUang;
import com.daggertwo.tes.model.Soldier;
import com.daggertwo.tes.model.Starks;
import com.daggertwo.tes.model.War;

import java.util.ArrayList;
import java.util.List;

import dagger.Component;

@Component(modules = BraavosModule.class)
interface BattleComponent {
    War getWa();
    Starks getStark();
    Bolton getBolt();
    Cash getCash();
    Soldier getSoldier();
}

public class MainActivity extends AppCompatActivity implements MainActivityImp{
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
        setContentView(R.layout.activity_main);


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
        AdapterMonth mAdapter = new AdapterMonth(MainActivity.this, getDailyData(),this);
        rvDate.setAdapter(mAdapter);


        LinearLayoutManager layoutManagerDayVerti
                = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvKriteriaDate.setLayoutManager(layoutManagerDayVerti);
        contentDaily = getKriteria();
        mKriteria = new AdapterKriteria(MainActivity.this, contentDaily);
        rvKriteriaDate.setAdapter(mKriteria);

        LinearLayoutManager layoutManagerWeek
                = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
//        layoutManagerWeek.setReverseLayout(false);
        rvKriteriaWeek.setLayoutManager(layoutManagerWeek);
        AdapterCash mAdapterWeek = new AdapterCash(MainActivity.this, getUang());
        rvKriteriaWeek.setAdapter(mAdapterWeek);
//
//        LinearLayoutManager layoutManagerWeekVerti
//                = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
//        rvKriteriaWeek.setLayoutManager(layoutManagerWeekVerti);
//        AdapterKriteria mKriteriaWeek = new AdapterKriteria(MainActivity.this, getKriteria());
//        rvKriteriaWeek.setAdapter(mKriteriaWeek);
//
//
//        LinearLayoutManager layoutManagerdYear
//                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
////        layoutManagerdYear.setReverseLayout(true);
//        rvYear.setLayoutManager(layoutManagerdYear);
//        AdapterMonth mAdapterdYear = new AdapterMonth(MainActivity.this, getMontlyMTD());
//        rvYear.setAdapter(mAdapterdYear);
//
//        LinearLayoutManager layoutManagerdYearVerti
//                = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
//        rvKriteriaYear.setLayoutManager(layoutManagerdYearVerti);
//        AdapterKriteria mKriteriadYear = new AdapterKriteria(MainActivity.this, getKriteria());
//        rvKriteriaYear.setAdapter(mKriteriadYear);


//        BattleComponent component = DaggerBattleComponent.create();
//        War war = component.getWa();
//        war.prepare();
//        war.report();
//
//        Starks star = component.getStark();
//
//        Bolton bolton = component.getBolt();

//        Cash cash = new Cash();
//        Soldier soldier = new Soldier();
//
//        BattleComponent component1 = DaggerBattleComponent.builder().braavosModule(new BraavosModule(cash,soldier)).build();
//        War war = component1.getWa();
//        war.prepare();
//        war.report();
//
//        cash = component1.getCash();
//        component1.getSoldier();


    }

    private List<PojoPicker> getDailyData() {
        List<PojoPicker> featuredProducts = new ArrayList<PojoPicker>();
        featuredProducts.add(new PojoPicker("26", "Juni",0,true));
        featuredProducts.add(new PojoPicker("25", "Juni",1));
        featuredProducts.add(new PojoPicker("24", "Juni",2));
        featuredProducts.add(new PojoPicker("23", "Juni",3));
        featuredProducts.add(new PojoPicker("22", "Juni",4));
        featuredProducts.add(new PojoPicker("21", "Juni",5));
        featuredProducts.add(new PojoPicker("20", "Juni",6));
        featuredProducts.add(new PojoPicker("19", "Juni",7));
        featuredProducts.add(new PojoPicker("18", "Juni",8));
        featuredProducts.add(new PojoPicker("17", "Juni",9));
        featuredProducts.add(new PojoPicker("16", "Juni",10));
        return featuredProducts;
    }

    private List<PojoCrit> getKriteria() {
        List<PojoCrit> featuredProducts = new ArrayList<PojoCrit>();
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38","4","4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38","4","4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38","4","4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38","4","4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38","4","4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38","4","4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38","4","4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38","4","4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38","4","4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38","4","4000"));
        return featuredProducts;
    }


    private List<PojoCrit> getKriteria2() {
        List<PojoCrit> featuredProducts = new ArrayList<PojoCrit>();
        featuredProducts.add(new PojoCrit("Swine", "07:38","4","4000"));
        featuredProducts.add(new PojoCrit("Swine", "07:38","4","4000"));
        featuredProducts.add(new PojoCrit("Swine", "07:38","4","4000"));
        featuredProducts.add(new PojoCrit("Swine", "07:38","4","4000"));
        featuredProducts.add(new PojoCrit("Swine", "07:38","4","4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38","4","4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38","4","4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38","4","4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38","4","4000"));
        featuredProducts.add(new PojoCrit("Swine Flue", "07:38","4","4000"));
        return featuredProducts;
    }

    private List<PojoPicker> getWeeklyMTD() {
        List<PojoPicker> featuredProducts = new ArrayList<PojoPicker>();
        featuredProducts.add(new PojoPicker("1", "Minggu",0));
        featuredProducts.add(new PojoPicker("2", "Minggu",1));
        featuredProducts.add(new PojoPicker("3", "Minggu",2));
        featuredProducts.add(new PojoPicker("4", "Minggu",3));
        featuredProducts.add(new PojoPicker("5", "Minggu",4));
        return featuredProducts;
    }

    private List<PojoPicker> getMontlyMTD() {
        List<PojoPicker> featuredProducts = new ArrayList<PojoPicker>();
        featuredProducts.add(new PojoPicker("Jan", "2019",0));
        featuredProducts.add(new PojoPicker("Feb", "2019",1));
        return featuredProducts;
    }

    @Override
    public void loadDaily() {
//        Toast.makeText(MainActivity.this,"Loading",Toast.LENGTH_SHORT).show();
        tvTotal.setText("Loaded");
        contentDaily.clear();
        contentDaily.addAll(getKriteria2());
        mKriteria.notifyDataSetChanged();
        startActivity(new Intent(MainActivity.this, SwipeActivity.class));
    }


    private List<PojoUang> getUang() {
        List<PojoUang> featuredProducts = new ArrayList<>();
        featuredProducts.add(new PojoUang(10000,"21 Jun 2019","10:00:00",true));
        featuredProducts.add(new PojoUang(12000,"21 Jun 2019","10:00:00",false));
        featuredProducts.add(new PojoUang(13000,"21 Jun 2019","10:00:00",false));
        featuredProducts.add(new PojoUang(14000,"21 Jun 2019","10:00:00",true));
        return featuredProducts;
    }
    public void showCard(View view){
        startActivity(new Intent(MainActivity.this, CardActivity.class));

    }
}

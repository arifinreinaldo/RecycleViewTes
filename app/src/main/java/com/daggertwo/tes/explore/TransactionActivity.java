package com.daggertwo.tes.explore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.daggertwo.tes.R;
import com.daggertwo.tes.adapter.AdapterCash;
import com.daggertwo.tes.model.PojoUang;

import java.util.ArrayList;
import java.util.List;

public class TransactionActivity extends BaseActivity {

    private RecyclerView rvCash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);
        rvCash = findViewById(R.id.ActivityTrans_rvCash);

        LinearLayoutManager layoutManagerWeek
                = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
//        layoutManagerWeek.setReverseLayout(false);
        rvCash.setLayoutManager(layoutManagerWeek);
        AdapterCash mAdapterWeek = new AdapterCash(this, getUang());
        rvCash.setAdapter(mAdapterWeek);
    }
    private List<PojoUang> getUang() {
        List<PojoUang> featuredProducts = new ArrayList<>();
        featuredProducts.add(new PojoUang(10000,"21 Jun 2019","10:00:00",true));
        featuredProducts.add(new PojoUang(12000,"21 Jun 2019","10:00:00",false));
        featuredProducts.add(new PojoUang(13000,"21 Jun 2019","10:00:00",false));
        featuredProducts.add(new PojoUang(14000,"21 Jun 2019","10:00:00",true));
        featuredProducts.add(new PojoUang(10000,"21 Jun 2019","10:00:00",true));
        featuredProducts.add(new PojoUang(12000,"21 Jun 2019","10:00:00",false));
        featuredProducts.add(new PojoUang(13000,"21 Jun 2019","10:00:00",false));
        featuredProducts.add(new PojoUang(14000,"21 Jun 2019","10:00:00",true));
        featuredProducts.add(new PojoUang(10000,"21 Jun 2019","10:00:00",true));
        featuredProducts.add(new PojoUang(12000,"21 Jun 2019","10:00:00",false));
        featuredProducts.add(new PojoUang(13000,"21 Jun 2019","10:00:00",false));
        featuredProducts.add(new PojoUang(14000,"21 Jun 2019","10:00:00",true));
        return featuredProducts;
    }
}

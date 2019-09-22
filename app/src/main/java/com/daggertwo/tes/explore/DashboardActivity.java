package com.daggertwo.tes.explore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.daggertwo.tes.R;

public class DashboardActivity extends BaseActivity {
    private LinearLayout llStar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        llStar = findViewById(R.id.image_star_slot);
        int value = 2;
        for (int x = 1;x<=5;x++){
            boolean isEmpty = true;
            if(x<=value){
                isEmpty = false;
            }
            addStar(isEmpty);
        }
    }
    public void gotoTransaksi(View view){
        startActivity(new Intent(DashboardActivity.this, TransactionActivity.class));
    }
    public void gotoRiwayat(View view){
        startActivity(new Intent(DashboardActivity.this, RiwayatActivity.class));
    }
    public void gotoRangkuman(View view){
        startActivity(new Intent(DashboardActivity.this, SwipeActivity.class));
    }
    public void showAchievement(View view){
        startActivity(new Intent(DashboardActivity.this, SwipeActivity.class));
    }

    private void addStar(boolean isEmpty){
        ImageView iv = new ImageView(this);
        if(isEmpty){
            iv.setImageDrawable(getDrawable(R.drawable.ic_empty_star));
        }else {
            iv.setImageDrawable(getDrawable(R.drawable.ic_full_star));
        }
        int value = 60;
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        iv.setLayoutParams(lp);
        iv.getLayoutParams().height = value;
        iv.getLayoutParams().width = value;

        llStar.addView(iv);

    }
}

package com.daggertwo.tes.explore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.daggertwo.tes.R;

public class BaseActivity extends AppCompatActivity {
    private TextView tvTitle;
    private ImageView ivInfo,ivMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void showInfo(View view){
        startActivity(new Intent(this, InfoActivity.class));
    }
    public void showMessage(View view){
        startActivity(new Intent(this, MessageActivity.class));
    }

    public void setTvTitle(String value) {
        tvTitle = findViewById(R.id.text1);
        this.tvTitle.setText(value);
    }

    protected void hideInfo(){
        this.ivInfo = findViewById(R.id.info_icon);
        this.ivInfo.setVisibility(View.GONE);
    }
    protected void hideMessage(){
        View view = findViewById(R.id.message_icon);
        view.setVisibility(View.GONE);
    }
    protected void backArrow(View view){
        this.onBackPressed();
    }
}

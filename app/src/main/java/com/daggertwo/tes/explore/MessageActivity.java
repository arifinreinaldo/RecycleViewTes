package com.daggertwo.tes.explore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.daggertwo.tes.R;
import com.daggertwo.tes.adapter.AdapterKriteria;
import com.daggertwo.tes.adapter.AdapterMessage;
import com.daggertwo.tes.model.PojoMessage;

import java.util.ArrayList;

public class MessageActivity extends BaseActivity {
    private RecyclerView rvMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        rvMessage = findViewById(R.id.rvMessage);

        ArrayList<PojoMessage> listMessage = new ArrayList<>();
        listMessage.add(new PojoMessage("Boya","Message is generated"));
        listMessage.add(new PojoMessage("Boya","Message is generated"));
        listMessage.add(new PojoMessage("Boya","Message is generated"));
        listMessage.add(new PojoMessage("Boya","Message is generated"));

        LinearLayoutManager layoutManagerDay
                = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvMessage.setLayoutManager(layoutManagerDay);
        AdapterMessage mAdapter = new AdapterMessage(listMessage,this);
        rvMessage.setAdapter(mAdapter);

        hideMessage();
        setTvTitle("Message");
    }
}

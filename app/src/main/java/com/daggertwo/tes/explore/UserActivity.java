package com.daggertwo.tes.explore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.daggertwo.tes.R;
import com.daggertwo.tes.adapter.AdapterKriteria;
import com.daggertwo.tes.adapter.AdapterUser;
import com.daggertwo.tes.model.PojoUser;

import java.util.ArrayList;

public class UserActivity extends AppCompatActivity implements UserActivityListener{
    private RecyclerView rvUser;
    private AdapterUser adUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        rvUser = findViewById(R.id.rvUsers);

        LinearLayoutManager layoutManagerDayVerti
                = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvUser.setLayoutManager(layoutManagerDayVerti);

        adUser = new AdapterUser(getUser(),this ,this);
        rvUser.setAdapter(adUser);
    }

    private ArrayList<PojoUser> getUser(){
        ArrayList<PojoUser> pojoUsers = new ArrayList<>();
        pojoUsers.add(new PojoUser("Gundala","Driver","B124TOP"));
        pojoUsers.add(new PojoUser("Godam","Helper","B124TOP"));
        return pojoUsers;
    }

    @Override
    public void callDashboard() {
        startActivity(new Intent(this, DashboardActivity.class));
    }
}

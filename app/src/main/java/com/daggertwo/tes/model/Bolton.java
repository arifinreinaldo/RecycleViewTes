package com.daggertwo.tes.model;

import com.daggertwo.tes.House;

import javax.inject.Inject;

public class Bolton implements House {

    @Inject
    public Bolton(){

    }

    @Override
    public void prepareForWar() {
        System.out.println(this.getClass().getSimpleName()+" prepared for war");
    }

    @Override
    public void reportForWar() {
        System.out.println(this.getClass().getSimpleName()+" reporting");
    }
}

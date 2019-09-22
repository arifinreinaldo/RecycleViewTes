package com.daggertwo.tes;

import com.daggertwo.tes.model.Cash;
import com.daggertwo.tes.model.Soldier;

import dagger.Module;
import dagger.Provides;

@Module
public class BraavosModule {
    Cash cashless;
    Soldier soldiers;

    public BraavosModule(Cash cash,Soldier soldier){
        cashless = cash;
        soldiers = soldier;
    }

    @Provides
    Cash provideCash(){
        return cashless;
    }
    @Provides
    Soldier provideSoldier(){
        return soldiers;
    }
}

package com.daggertwo.tes.model;

import javax.inject.Inject;

public class War {
    private Starks starks;
    private Bolton bolton;

    @Inject
    public War(Starks starks1,Bolton  bolton1){
        starks = starks1;
        bolton = bolton1;
    }
    public void prepare(){
        starks.prepareForWar();
        bolton.prepareForWar();
    }
    public void report(){
        starks.reportForWar();
        bolton.reportForWar();

    }
}

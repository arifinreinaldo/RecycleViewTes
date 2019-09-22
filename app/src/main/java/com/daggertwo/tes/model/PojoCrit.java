package com.daggertwo.tes.model;

public class PojoCrit {
    private String kriteria;
    private String hasil;
    private String insentif;
    private String poin;

    public PojoCrit(){

    }

    public PojoCrit(String kriteria, String hasil, String insentif, String poin) {
        this.kriteria = kriteria;
        this.hasil = hasil;
        this.insentif = insentif;
        this.poin = poin;
    }

    public String getKriteria() {
        return kriteria;
    }

    public void setKriteria(String kriteria) {
        this.kriteria = kriteria;
    }

    public String getHasil() {
        return hasil;
    }

    public void setHasil(String hasil) {
        this.hasil = hasil;
    }

    public String getInsentif() {
        return insentif;
    }

    public void setInsentif(String insentif) {
        this.insentif = insentif;
    }

    public String getPoin() {
        return poin;
    }

    public void setPoin(String poin) {
        this.poin = poin;
    }
}

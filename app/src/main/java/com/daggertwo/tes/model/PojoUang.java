package com.daggertwo.tes.model;

public class PojoUang {
    private double cash;
    private String date;
    private String time;
    private boolean inout;

    public PojoUang(double cash, String date, String time, boolean inout) {
        this.cash = cash;
        this.date = date;
        this.time = time;
        this.inout = inout;
    }

    @Override
    public String toString() {
        return "PojoUang{" +
                "cash=" + cash +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", inout=" + inout +
                '}';
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isInout() {
        return inout;
    }

    public void setInout(boolean inout) {
        this.inout = inout;
    }

    public String getTitle(){
        return inout == true ? "Transaksi Uang Masuk ":"Transaksi Uang Keluar";
    }
}

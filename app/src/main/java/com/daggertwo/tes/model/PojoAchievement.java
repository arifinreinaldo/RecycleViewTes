package com.daggertwo.tes.model;

public class PojoAchievement {
    private int max_value = 0;
    private int cur_value = 0;
    private String status = "";
    private String desc = "";
    private int image_src = 0;

    public PojoAchievement(int max_value, int cur_value, String status, String desc, int image_src) {
        this.max_value = max_value;
        this.cur_value = cur_value;
        this.status = status;
        this.desc = desc;
        this.image_src = image_src;
    }

    public int getMax_value() {
        return max_value;
    }

    public void setMax_value(int max_value) {
        this.max_value = max_value;
    }

    public int getCur_value() {
        return cur_value;
    }

    public void setCur_value(int cur_value) {
        this.cur_value = cur_value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImage_src() {
        return image_src;
    }

    public void setImage_src(int image_src) {
        this.image_src = image_src;
    }
}

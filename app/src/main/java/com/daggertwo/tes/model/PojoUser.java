package com.daggertwo.tes.model;

public class PojoUser {
    private String username;
    private String type;
    private String plate_no;

    public PojoUser(String username, String type, String plate_no) {
        this.username = username;
        this.type = type;
        this.plate_no = plate_no;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlate_no() {
        return plate_no;
    }

    public void setPlate_no(String plate_no) {
        this.plate_no = plate_no;
    }
}

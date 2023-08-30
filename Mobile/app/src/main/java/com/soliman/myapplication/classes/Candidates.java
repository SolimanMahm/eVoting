package com.soliman.myapplication.classes;

public class Candidates {
    private String name, description;
    private int imgid;

    public Candidates() {
    }

    public Candidates(String cname, String description, int imgid) {
        this.name = name;
        this.imgid = imgid;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }

}

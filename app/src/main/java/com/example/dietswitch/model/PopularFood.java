package com.example.dietswitch.model;

public class PopularFood {

    String name;
    String Kcal;
    Integer imageUrl;


    public PopularFood(String name, String cal,Integer imageUrl) {
        this.name = name;
        this.Kcal = Kcal;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKcal() {
        return Kcal;
    }

    public void setKcal(String kcal) {
        Kcal = kcal;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }
}

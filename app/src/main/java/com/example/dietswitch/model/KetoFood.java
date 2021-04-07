package com.example.dietswitch.model;

public class KetoFood {

    String name;
    String Kcal;
    Integer imageUrl;
    String rating;

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public KetoFood(String name, String cal, Integer imageUrl, String rating) {
        this.name = name;
        this.Kcal = Kcal;
        this.imageUrl = imageUrl;
        this.rating = rating;
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

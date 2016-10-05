package com.patrick;

/**
 * Created by Patrick on 10/5/2016.
 */
public class Butterfly extends Insect {
    public Butterfly(String wingColor, String favoriteFlower, String name, int wingNumber) {
        this.wingColor = wingColor;
        this.favoriteFlower = favoriteFlower;
        this.name = name;
        this.wingNumber = wingNumber;
    }

    protected String wingColor;

    public String getWingColor() {
        return wingColor;
    }

    public void setWingColor(String wingColor) {
        this.wingColor = wingColor;
    }

    public String getfavoriteFlower() {
        return favoriteFlower;
    }

    public void setfavoriteFlower(String favoriteFlower) {
        this.favoriteFlower = favoriteFlower;
    }

    protected String favoriteFlower;
}

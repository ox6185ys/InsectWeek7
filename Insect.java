package com.patrick;

/**
 * Created by Patrick on 10/5/2016.
 */
public abstract class Insect
{
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWingNumber() {
        return wingNumber;
    }

    public void setWingNumber(int wingNumber) {
        this.wingNumber = wingNumber;
    }

    protected int wingNumber;
    int legNumber =6;
}

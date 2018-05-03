package com.google.inject;

public class Laptop {

    private String model;
    private String price;

    public Laptop(){
        this.model = "HP";
        this.price = "20";
    }

    public String toString(){
        return "[Laptop: " + model + "," + price + "]";
    }
}

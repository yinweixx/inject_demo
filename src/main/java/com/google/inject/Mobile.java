package com.google.inject;

public class Mobile {
    private String number;
    private String no;

    public Mobile(){
        this.number = "988438434";
    }

    public Mobile(String no){
        this.no = "123";
    }

    public String toString(){
        return "[Mobile: " + number + "]" + "no = " + no;
    }
}

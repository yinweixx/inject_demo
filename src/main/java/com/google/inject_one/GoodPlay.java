package com.google.inject_one;

public class GoodPlay implements Player{
    @Override
    public void bat() {
        System.out.println("I can hit any ball");
    }

    @Override
    public void bowl() {
        System.out.println("I can also bowl");
    }
}

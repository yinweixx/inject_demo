package com.google.inject_one;

public class BadPlayer implements Player{
    @Override
    public void bat() {
        System.out.println("I think I can face the ball");
    }

    @Override
    public void bowl() {
        System.out.println("I don't know bowling");
    }
}

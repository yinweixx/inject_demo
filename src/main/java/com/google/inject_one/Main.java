package com.google.inject_one;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;


public class Main {

    public static void main(String[] args){
        Injector injector = Guice.createInjector(new PlayerModule());

        Player player = injector.getInstance(Key.get(Player.class, Names.named("Good")));

        player.bat();
        player.bowl();
        player = injector.getInstance(Key.get(Player.class, Names.named("Bad")));
        player.bat();
        player.bowl();
    }
}

package com.google.inject_one;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class PlayerModule extends AbstractModule {
    @Override
    public void configure() {
        bind(Player.class).annotatedWith(Names.named("Good")).to(GoodPlay.class);
        bind(Player.class).annotatedWith(Names.named("Bad")).to(BadPlayer.class);
    }
}

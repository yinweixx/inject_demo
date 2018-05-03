package com.template.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class InjectorsBuilder {

    private static InjectorsBuilder builder;
    private Injector kernelInjector;

    private InjectorsBuilder(){

    }

    public static InjectorsBuilder getBuilder(){
        synchronized (InjectorsBuilder.class){
            if(builder == null)
                builder = new InjectorsBuilder();
        }
        return builder;
    }

    public InjectorsBuilder build(AbstractModule... modules){
        if(kernelInjector != null)
            kernelInjector = null;
        kernelInjector = Guice.createInjector(modules);
        return this;
    }

    public Injector getKernelInjector() {
        return kernelInjector;
    }

    public <T> T getInstanceByType(Class<T> tClass){
        return kernelInjector.getInstance(tClass);
    }
}

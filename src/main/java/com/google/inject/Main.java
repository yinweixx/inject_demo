package com.google.inject;

public class Main {

    public static void main(String[] args){
        Injector injector = Guice.createInjector();
        Person person = injector.getInstance(Person.class);
        person.diplayInfo();
    }
}

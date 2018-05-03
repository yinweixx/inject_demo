package com.google.inject;

public class Person {


    private Mobile mobile;
    private Laptop laptop;

    @Inject
    public Person(Mobile mobile, Laptop laptop){
        this.mobile = mobile;
        this.laptop = laptop;
    }

    public void diplayInfo(){
        System.out.println("Mobile:" + mobile.toString());
        System.out.println("Laptop:" + laptop);
    }
}

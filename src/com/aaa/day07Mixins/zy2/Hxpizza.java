package com.aaa.day07Mixins.zy2;

public class Hxpizza extends Pizza{


    public Hxpizza(String name, int price, int size) {
        super(name, price, size);
    }

    @Override
    public String zg() {
        System.out.println("Hxpizza");
        return "hxps";
    }
}

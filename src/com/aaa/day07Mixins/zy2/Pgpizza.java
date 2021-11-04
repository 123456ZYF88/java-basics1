package com.aaa.day07Mixins.zy2;

public class Pgpizza extends Pizza{

    public Pgpizza(String name, int price, int size) {
        super(name, price, size);
    }

    @Override
    public  String zg(){
        System.out.println("Pgpizza");
        return "培根披萨";

    }

}

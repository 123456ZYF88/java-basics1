package com.aaa.day07Mixins.zy2;

public  class Pizza {
   private String name;
   private int price;
   private int size;

    public void Pizza(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Pizza(String name, int price, int size) {
        this.name = name;
        this.price = price;
        this.size = size;
        System.out.println(name+","+price+","+size+".");
    }

    public  String zg(){

         return "展示";
    }
}

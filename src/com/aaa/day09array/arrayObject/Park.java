package com.aaa.day09array.arrayObject;

import java.util.Objects;

public class Park implements Comparable<Park>{
    private String name;
    private int price;

    public Park(String name, int price) {
        this.name = name;
        this.price = price;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Park park = (Park) o;
        return price == park.price && Objects.equals(name, park.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public int compareTo(Park o) {
        if(this.price>o.price){
            return 1;
        }else if(this.price<o.price){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Park{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

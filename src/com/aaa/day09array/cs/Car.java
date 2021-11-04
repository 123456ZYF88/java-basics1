package com.aaa.day09array.cs;

import java.util.Date;
import java.util.Objects;

public class Car {//1. 声明一个汽车类：Car，
    private String name;
    private String pp;
    private int jqh;
//有参构造
    public Car(String name, String pp, int jqh) {
        this.name = name;
        this.pp = pp;
        this.jqh = jqh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPp() {
        return pp;
    }

    public void setPp(String pp) {
        this.pp = pp;
    }

    public int getJqh() {
        return jqh;
    }

    public void setJqh(int jqh) {
        this.jqh = jqh;
    }
//重写equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return jqh == car.jqh && Objects.equals(name, car.name) && Objects.equals(pp, car.pp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pp, jqh);
    }
//重写toString
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", pp=" + pp +
                ", jqh=" + jqh +
                '}';
    }
}

package com.aaa.day07Mixins;

public class Person {
    private String name;
    private int age;
    public void eat(){
        System.out.println("perspn:吃饭");
    }
    public void sleep(){
        System.out.println("Perspn:睡觉");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

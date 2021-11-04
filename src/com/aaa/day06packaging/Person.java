package com.aaa.day06packaging;

public class Person {
    //父类
    private String name;
    private int age;
    protected String sex;//protected 这个变量在一个包里都能调用
    private   String address;
    public  Person(){
        System.out.println("无参构造函数");
    }
    public Person (String name,int age){
        System.out.println("由此观之");
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void eat(){

    }
    void sleep(){

    }
    void study(){

    }

    public String getAddress() {
        return address;
    }
    //不公开的变量需要用通过方法来调用
    public void setAddress(String address) {
        this.address = address;
    }
    public  void sd(){
        System.out.println("撒旦法");
    }

}

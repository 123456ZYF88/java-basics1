package com.aaa.day03;

public class PersonTest {
    public static void main(String[] args) {
        //通过自己定义的有参构造方法创建对象
     Person p1=new Person(4,"王五",23,"中国");
        Person p2=new Person(5,"王s",25,"中国");
        System.out.println(p1.name);
    }
}

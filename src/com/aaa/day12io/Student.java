package com.aaa.day12io;

import java.io.Serializable;

public class Student implements  Serializable{//序列化必须实现Serializable 接口
    private static final long serialversionUID= 4333333333343453543L;
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
   public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

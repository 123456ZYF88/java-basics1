package com.aaa.day09array;

import java.util.Objects;
import java.util.concurrent.CompletionService;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "学生{" +
                "姓名='" + name + '\'' +
                ", 年龄=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.age>o.age){
            return 1;
        }else if(this.age<o.age){
            return -1;
        }
        return 0;
    }
}


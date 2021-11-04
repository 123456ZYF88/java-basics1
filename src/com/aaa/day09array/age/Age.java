package com.aaa.day09array.age;

public class Age implements Comparable<Age>{
    private int age;
    private String name;

    public Age(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Age o) {
        if(this.age>o.age){
            return 1;
        }else if(this.age<o.age){
            return -1;
        }
        return 0;

    }

    @Override
    public String toString() {
        return "Age{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

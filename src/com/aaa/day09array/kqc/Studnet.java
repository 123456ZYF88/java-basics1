package com.aaa.day09array.kqc;

public class Studnet implements Comparable<Studnet>{
    private int age;
    private String name;

    public Studnet(int age, String name) {
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
    public String toString() {
        return "Studnet{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Studnet o) {
        if(this.age>o.age){
            return 1;
        }else if (this.age<o.age){
            return -1;
        }
        return 0;
    }
}

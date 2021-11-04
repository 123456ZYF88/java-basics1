package com.aaa.day06packaging.zy;

public class Person {
    /*
    * （1）字段：身份证号idCard，姓名name,性别gender，年龄age，职业profession，联系方式phone。并定义相应的属性；
（2）定义函数message()输出个人的基本信息。
（3）定义无参构造函数,并打印一句话，输出“我是人类”。*/
    long idCard;//身份证
    String name;//姓名
    String gender;//性别
    int age;//年龄
    String profession;//职业
    long phone;//手机号

    public Person(String name) {
        this.name = name;

    }

    void message(){
        System.out.println("身份证"+idCard+",姓名"+name+",性别"+gender+",年龄"+age+",职业"+profession+",手机号"+phone);
    }
    public Person(){
        System.out.println("我是人类");
    }

   /* public static void main(String[] args) {
        Person rl=new Person();
        rl.idCard=412828200111250198L;
        rl.name="撒旦法";
        rl.gender="男";
        rl.age=999;
        rl.profession="恶魔";
        rl.phone=15836784326L;
        rl.message();
    }*/
}

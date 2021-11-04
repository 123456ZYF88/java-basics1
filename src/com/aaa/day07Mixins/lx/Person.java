package com.aaa.day07Mixins.lx;


public class Person {
    public void feed(Cat cat){
        cat.eat();
    }

    public void feed(Animal animal){ //
        animal.eat();
    }
    public static void main(String[] args) {
        Person n1=new Person();
        Cat cat=new Cat();
       // a1.feed();//将各种动物转换成父类  类型转换成Animal   此时Animal可以是Cat 也可以是Dog
        Dog dog=new Dog();
        Hare hare=new Hare();
       // a2.feed();

        n1.feed(cat);//实参
        n1.feed(dog);
        n1.feed(hare);
    }
}

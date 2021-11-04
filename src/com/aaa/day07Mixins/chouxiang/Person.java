package com.aaa.day07Mixins.chouxiang;


import com.aaa.day07Mixins.lx.Animal;
import com.aaa.day07Mixins.lx.Cat;
import com.aaa.day07Mixins.lx.Dog;
import com.aaa.day07Mixins.lx.Hare;

public class Person {
    public void feed(com.aaa.day07Mixins.lx.Cat cat){
        cat.eat();
    }

    public void feed(Animal animal){ //
        animal.eat();
    }
    public static void main(String[] args) {

       Cat cat=new Cat();
        Person n1=new Person();
        n1.feed(cat);//实参
        Animal an=new Cat();
        an.eat();
    }
}

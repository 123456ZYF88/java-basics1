package com.aaa.day10gather.kqc;

import com.aaa.day09array.age.Age;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(new Student("a",20));
        list.add(new Student("b",21));
        list.add(new Student("c",21));
        list.add(new Student("d",21));



        Iterator iterator=list.iterator();
        for (Object obj:list){
            System.out.println(obj);
        }
        System.out.println("]]]]]]]]]]]]]]]]");
        list.remove(2);
        for (Object obj:list){
            System.out.println(obj);
        }

    }

}

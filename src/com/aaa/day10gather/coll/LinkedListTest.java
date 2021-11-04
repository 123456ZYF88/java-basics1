package com.aaa.day10gather.coll;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class LinkedListTest {
    //底层是一个链表
    public static void main(String[] args) {
        Vector list=new Vector();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add("4");

        for(Object obj:list){
            System.out.println(obj+"\t");
        }
        System.out.println("==============");
        HashSet hashSet=new HashSet();
        hashSet.add("b");
        hashSet.add("a");
        hashSet.add("3");
        hashSet.add("4");
        hashSet.add("sdfasdf");

        for(Object obj:hashSet){
            System.out.println(obj);
        }
        Iterator<Object> iterator=hashSet.iterator();
    }
}

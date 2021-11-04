package com.aaa.day10gather.fanxing;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        List<Integer> list1=new ArrayList<Integer>();

        list.add("sdf");
        list.add("3");
        list1.add(32);
        System.out.println(list.get(1));
        for (String str:list){
            System.out.println(str);
        }
    }
}

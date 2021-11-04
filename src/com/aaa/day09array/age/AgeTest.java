package com.aaa.day09array.age;

import java.util.Arrays;

public class AgeTest {
    public static void main(String[] args) {
        Age[] ages=new Age[5];
        ages[0]=new Age(34,"撒旦法");
        ages[1]=new Age(35,"撒旦法");
        ages[2]=new Age(36,"撒旦法");
        ages[3]=new Age(32,"撒旦法");
        ages[4]=new Age(31,"撒旦法");
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
        //
       //
    }
}

package com.aaa.day09array.kqc;


import java.util.Arrays;

public class StudentTset {
    public static void main(String[] args) {
        Studnet[] studnets=new Studnet[3];
        studnets[0]=new Studnet(11,"a");
        studnets[1]=new Studnet(13,"b");
        studnets[2]=new Studnet(12,"c");
        Arrays.sort(studnets);
        System.out.println(Arrays.toString(studnets));
    }
}

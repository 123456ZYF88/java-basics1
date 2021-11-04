package com.aaa.day09array;

import java.util.Arrays;

public class StudentTest2 {
    public static void main(String[] args) {
        Student[] student=new Student[4];
        student[0]=new Student("er",12);
        student[1]=new Student("ea",23);
        student[2]=new Student("ea",24);
        student[3]=new Student("ea",25);
        Arrays.sort(student);
        System.out.println(Arrays.toString(student));
    }
}

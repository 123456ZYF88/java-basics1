package com.aaa.day10gather.hashsetbai;

import java.util.Iterator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        //comparable接口  并且要重写  compareTo()方法
        PeoCompar student=new PeoCompar();
        //创建一个比较器对象
        TreeSet<Student> students=new TreeSet<>(student);
        students.add(new Student("张三",18));
        students.add(new Student("张2",119));
        students.add(new Student("张1",189));
        students.add(new Student("张4",184));
        for (Student stu:students){
            System.out.println(stu);
        }

    }
}

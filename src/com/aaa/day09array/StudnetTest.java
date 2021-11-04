package com.aaa.day09array;

import java.util.Arrays;

public class StudnetTest {
    public static void main(String[] args) {
        StudentManager studentManager=new StudentManager();
        //添加
        studentManager.dy(new Student("一",45));
        studentManager.dy(new Student("一",46));
        studentManager.dy(new Student("一",47));

        studentManager.print();
        //获取下标
        int a=studentManager.search(new Student("一",47));
        System.out.println("===============================");

        studentManager.delete(2);
        studentManager.print();
        //根据下标删除
        System.out.println("===============================");

        studentManager.delete(new Student("一",45));
        studentManager.print();
        System.out.println("===============================");
        //根据对象删除
        /*studentManager.aletr(new Student("一",46),new Student("修改",50));
        studentManager.print();
        System.out.println("===============================");*/
        //修改
        int b=studentManager.search(new Student("一",46));
        System.out.println(b);
        /*studentManager.aletr(b,new Student("修改",50));
        studentManager.print();*/

    }
}

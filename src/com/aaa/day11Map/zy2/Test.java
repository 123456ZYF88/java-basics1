package com.aaa.day11Map.zy2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test extends Student{
    public static void main(String[] args) {
        Test test=new Test();
        test.add();
        //test.print();
        Scanner sc1=new Scanner(System.in);
        //System.out.println(test.alter("a"));
        for (int i=1;i>0;i++){
            System.out.println("输入1显示每个班级的内容  输入2查看学生的班级");
            switch (sc1.nextInt()){
                case 1:
                    test.print();
                    break;
                case 2:
                    System.out.println("请输入学生姓名");
                    System.out.println(test.alter(sc1.next()));
                    break;
            }
        }

    }


}

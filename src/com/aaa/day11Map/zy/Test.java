package com.aaa.day11Map.zy;

import java.util.*;

public class Test extends Studnet{
    /*声明一个班级列表，每一个班级声明一个Map——name班级名  count人数a.
    循环录入5个班级b.ok
    录入一个班级名，查找班级得人数量c.
    录入一个班级名，删除——没有重写equals，只能自己查找下表，，根据下表删除
    * */
    public static void main(String[] args) {
        Test test=new Test();
        test.add();
       // test.print();

        Scanner sc1=new Scanner(System.in);
        for (int i=1;i>0;i++) {
            System.out.println("你想做什么, 输出内容1  删除班级 2 输出人数 3");

            switch (sc1.nextInt()) {
                case 1:
                    test.print();
                    break;
                case 2:
                    test.delete(sc1.next());
                    break;
                case 3:
                    test.atler(sc1.next());
                    break;
            }
        }

}
}

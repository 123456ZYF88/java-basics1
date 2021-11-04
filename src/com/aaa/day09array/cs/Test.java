package com.aaa.day09array.cs;

public class Test {
    public static void main(String[] args) {
        CarManager car=new CarManager();
        //添加1. 声明一个CarManager管理类，初始化一个cars数组，初始长度为1，满了之后每次扩展2个。
        //完成数组组得新增：分别为：
        car.add(new Car("现代","2021-01-01",111));
        car.add(new Car("大众","2021-02-02",222));
        car.add(new Car("奔驰","2021-03-03",333));
        car.add(new Car("宝马","2021-04-04",444));
        car.print();
        System.out.println("==========");
        // 完成数组得修改：将111号：更改：马萨拉蒂   2021-08-08  111
        car.alter(new Car("现代","2021-01-01",111),new Car("玛莎拉蒂","2021-8-8",111));
        car.print();
        System.out.println("==========");
        //    完成数组得删除：删除大众
        car.delete(new Car("大众","2021-02-02",222));
        car.print();
    }
}

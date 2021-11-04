package com.aaa.day06packaging;

import java.util.Scanner;

public class teacher {
    //封装一个老师类 性别只能赋值男女  年龄赋值范围25-60，
    //取值如果是男生正常如果女生都是18
    private String sex;
    private  int age;

    public String getSex() {
        return sex;
    }
        //性别
    public void setSex(String sex) {
        if(sex.equals("女") || sex.equals("男")){
            this.sex = sex;
        }else {
            System.out.println("别随便输入");
        }

    }
    public int getAge() {

        return age;

    }
    //年龄
    public void setAge(int age) {
        if(age>25 && age<60){
            if(sex.equals("女"))age=18;
            if(sex.equals("男"))age=age;

        }else{
            System.out.println("年龄必须在范围25-60");
            return;
        }
        this.age = age;
    }

    public static void main(String[] args) {
        System.out.println("你的性别是：");
       Scanner sc=new Scanner(System.in);
       String sex=sc.next();
        System.out.println("你的年龄是：");
        Scanner sc1=new Scanner(System.in);
        int age=sc1.nextInt();
        teacher r=new teacher();
        r.setAge(age);
        r.setSex(sex);
        System.out.println(r.getSex()+","+r.getAge());
    }
}

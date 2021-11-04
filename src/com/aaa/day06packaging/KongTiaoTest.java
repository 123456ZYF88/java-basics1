package com.aaa.day06packaging;

public class KongTiaoTest {
    public static void main(String[] args) {
        //封装  继承
//        KongTiao kongTiao=new KongTiao();
//        kongTiao.setWendu(-100);
//        System.out.println(kongTiao.getWendu());

        //Kong person=new Kong();

/*       person.setAddress("sdfadsf");
        person.sex="打发斯蒂芬";//公开的可以直接调用
        System.out.println(person.getAddress());
        System.out.println(person.sex);
        person.sd();
        person.ssd();*/

        Kong stu =new Kong("zs",45);//调用有参
        System.out.println(stu.getName());
        //Person stu1=new Person();
        Kong stu2=new Kong();//调用无参构造函数

    }
}

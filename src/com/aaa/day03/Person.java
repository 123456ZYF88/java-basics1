package com.aaa.day03;

public class Person {
   int id;
   String name;
   int age
           ;
   String address;
  /* public Person(int a,String b, int c ,String d ){
       id = a ;
       name = b;
       age = c;
              address =d;
       System.out.println(a+","+b+","+c+","+d);

   }*/
    public Person (int id,String name,int age,String address){
        this.id =id;
        this.name =name;
        this.address=address; //this表示当前这个对象。吧传入的参数赋给当前对象的相应变量
        System.out.println(id+","+name+","+age+","+address);
    }

}

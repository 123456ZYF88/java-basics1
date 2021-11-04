package com.aaa.day06packaging;

public class Kong extends Person{
    //子类
    //this 当前--调用当前对象的  如果没有会调用父类的
    //super父类   直接调用父类的
    String sushe;
    public  void sd(){//方法覆盖
        System.out.println("sadfsadf");
    }
    void  ssd(){
        super.sd();
    }

    public Kong(){
        //System.out.println("kong");
        super();//调用父类无参构造函数
    }
    public  Kong (String name,int age){
      // super(name,age);
        this.sushe=sushe;
        System.out.println("sdf");
    }

}

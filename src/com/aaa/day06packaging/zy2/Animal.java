package com.aaa.day06packaging.zy2;

public class Animal {
    /*
    * 定义一个基类Animal
    *
      该类还包含一个公共成员函数who()，它可以显示一个消息，给出Animal对象的名称和重量。
       把Animal用作公共基类，派生两个类Lion和Aardvark。再编写一个main()函数，
* 创建Lion和Aardvark对象（"Leo"，400磅；"Algernon"，50磅）。
* 为派生类对象调用who()成员，说明who()成员在两个派生类中是继承得来的。
*/
    public Animal() {
    }
    private String name;//，它包含两个私有数据成员，一个是string，存储动物的名称（例如"Fido"或"Yogi"），
    private int weight;//另一个是整数成员weight，包含该动物的重量（单位是磅）。
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public  void who(){
        System.out.println("姓名："+name+",重量："+weight+"磅");
    }

}

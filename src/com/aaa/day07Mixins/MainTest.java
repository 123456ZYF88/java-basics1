package com.aaa.day07Mixins;

public class MainTest {
    public static void main(String[] args) {

        //继承是多态的基础  重写也是多态的基础
        //声明一个父类可以 指向子类的引用
        Person p1=new Teacher();
        //通过父类下指令，结果执行多种 具体执行子类
        p1.eat();
        //不能通过父类引用调用子类独有的方法
        p1.sleep();//没有重写 ，子类没有那么就调用父类
        //编译器看左  运行看右
        Person p2=new Student();

        p2.eat();
        p2.sleep();
        Person p3 =new Student();
        p3.eat();//父类子类  都有执行子类
        p3.sleep();//父有子没有  --执行的就是父类的方法
        //如果子类有父类没有 ，通过父类根本不能调用
        //想调用子类独有的  就需要强转  将父类强转成子类   下转型
        Person p4 =new Teacher();
        //
        //强转是由风险的----必须实际的对象和强转对象一致
        if(p4 instanceof Teacher){//判断p4是否Teacher的实例
            Teacher t=(Teacher) p4;
            t.beike();
        }
        Student t1=(Student) p3;
        t1.dayouxi();
    }
}

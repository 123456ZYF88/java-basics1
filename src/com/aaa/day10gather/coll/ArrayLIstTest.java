package com.aaa.day10gather.coll;

import com.aaa.day09array.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLIstTest {
    public static void main(String[] args) {

       ArrayList list=new ArrayList ();
        list.add(1);//追加add()
        list.add(2);
        list.add("sf");
        list.add(new Student("com.aaa.day09array.Student",111));

        list.remove("sf");//肯定根据内容
        list.remove(1);//根据2   根据索引删除  在根据
        list.remove(new Integer(2));//删除 的是2的内容
        //索引获取get(index)
        System.out.println(list.get(0));
        //插入
        list.add(2,"AAA");
        // isEmpty()  判断ArrayList中是否有数据
        System.out.println(list.isEmpty());
        //个数遍历size()
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //indexOf获取索引
        System.out.println(list.indexOf(2));
        //list.toArray(listArr);
        System.out.println("+++++++++++++");
        //迭代器

        Iterator it=list.iterator();

        while (it.hasNext()){
            Object obj=it.next();//拿object这个类型的值可以接任何数据类型
            if(obj.equals(1)){//删除
                list.remove(obj);
                break;
            }
        }
        System.out.println(list);
      /*  System.out.println("+++++++++++++");
        while (it.hasNext()){
            Object obj=it.next();
            System.out.println(obj);
        }*/
    }
}

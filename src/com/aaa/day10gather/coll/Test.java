package com.aaa.day10gather.coll;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Collection coll =new ArrayList();
        //add 添加添加
        coll.add("zs");
        coll.add("ls");
        coll.add("wu");
        coll.add("zs");
        //contains 蕴含 包含 包含某字符串 查询字符    判断是否有zs  返回一个boolean的值
        boolean state=coll.contains("zs");
        System.out.println(state);

        coll.remove("wu");
        //遍历  collection 没有针对索引得到方法
        for(Object o:coll){
            System.out.println(o+"\t");
        }

        System.out.println();
        //迭代器 迭代器模式 迭代子 迭代子模式    Iterator  名 =循环判断目标.iterator();  主要用来遍历集合
        Iterator its =coll.iterator();
        while (its.hasNext()){
            System.out.println(its.next()+"\t");

        }

        System.out.println(coll.size());
        System.out.println(coll.getClass());
    }
}

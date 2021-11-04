package com.aaa.day10gather.hashMapTest;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //声明一个列表存储多个学生
        //每行信息存储多个相同信息还是用list
            /*特性：
            Hashmap
            * 允许出现空值
            * HashTable
            不允许空值

            两个都是无序的  不安全的
            * */
        //声明一个对象 存储一个学生对象  项姓名  年龄
        HashMap map=new HashMap();
        map.put("name","张三");
        map.put("age",11);
        map.put("id",122);
        System.out.println(map.get("id"));
        map.remove("id");//删除


        System.out.println(map.get("id"));//为空  项目
        // 直接put 键 值 修改 改
        map.put("id",123);
        System.out.println(map.get("id"));
        System.out.println(map.get("name"));//根据key name 获取 姓名

        HashMap map1=new HashMap();
        map1.put("name","张2");
        map1.put("age","33");
        System.out.println(map1.get("age"));
        System.out.println("==========");
        /* Map *///遍历
        Collection values = map.values();
        for(Object obj: map.values()){
            System.out.println(obj+"\t");
        }//无序的
   /*     System.out.println("+++++");
        Set set=map.keySet();//
        for (Object key:set){
            System.out.println(key+"---"+map.get(key)+"\t");
        }
        System.out.println("+++++");
        //Map  遍历节点对象
        Set<Map.Entry> entrys=map.entrySet();
        for (Map.Entry entry:entrys){
            System.out.println(entry.getKey()+"===="+entry);
        }
*/

    }
}

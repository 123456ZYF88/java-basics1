package com.aaa.day11Map.zy;

import java.util.*;

public class Studnet {
        ArrayList<Map> arrayList=new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        public void add(){
                for (int i=1;i<=5;i++){
                        Map<String,Object> map=new HashMap();
                        System.out.println("请输入"+i+"班的名字和人数");
                        map.put("name",sc.next());
                        map.put("count",sc.nextInt());
                        arrayList.add(map);
                }
        }
        public void print (){
                for (Object obj:arrayList){
                        System.out.println(obj);
                }
        }
        public Object atler(String name){
                for (Map map:arrayList){
                        if (map.get("name").equals(name)){
                                Object a= map.get("count");
                                System.out.println( map.get("count"));
                                return  a;
                        }
                }
                return -1;
        }
        public boolean delete(String name){
                int index=-1;
                for(Map map:arrayList){
                        if (map.get("name").equals(name)){
                                arrayList.remove(map);
                                System.out.println("删除成功");
                                return  true;
                        }
                }
                return false;
        }

}

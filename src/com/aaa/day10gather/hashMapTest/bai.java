package com.aaa.day10gather.hashMapTest;

import com.aaa.day10gather.hashsetbai.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class bai {
    public static void main(String[] args) {
        List<Map> list=new ArrayList<>();

        Map<String,Object> map=new HashMap<>();
        map.put("name","qy142");
        List<Student> stus=new ArrayList<>();
        stus.add(new Student("aa",11));
        stus.add(new Student("bb",22));
        map.put("stuList",stus);

        list.add(map);

        map=new HashMap<>();
        map.put("name","qy142");

        for (Map map1:list){
            System.out.println(map1.get("stuList"));
        }

    }
}

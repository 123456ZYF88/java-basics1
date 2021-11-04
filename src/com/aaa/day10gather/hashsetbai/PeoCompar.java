package com.aaa.day10gather.hashsetbai;

import java.util.Comparator;

public class PeoCompar implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        //将数据强转成Student类型
        Student p1=(Student) o1;
        Student p2=(Student) o2;
        if(p1.getAge()>p2.getAge()){
            return -1;
        }else{
            return 1;
        }


    }
}

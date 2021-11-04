package com.aaa.day10gather;

import com.aaa.day06packaging.zy2.Aardvark;

import java.util.ArrayList;
import java.util.List;

public class LiskArray {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        //String[][] ints=new String[9][];
        //list嵌套list
        for (int i=0;i<9;i++){
            List list=new ArrayList<>();
            for (int j=0;j<=i;j++){
                list.add((i+1)+"*"+(j+1)+"="+(i+1)*(j+1));//给数组赋值
            }
            arrayList.add(list);
        }
        for (int i=0;i< arrayList.size();i++) {
            List list=(List) arrayList.get(i);
            for (int j=0; j < list.size(); j++) {
                System.out.print(list.get(j) + "\t");
            }
            System.out.println();
        }
        }

    }


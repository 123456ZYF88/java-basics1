package com.aaa.day09array;

import java.util.Arrays;

public class ArrayKR {
    public static void main(String[] args) {
        int[] arrs= new int[]{1,2,3,4,5};

       int [] temp =new int[arrs.length+1];//此时只是把长度给他了内容没有给

        for(int i=0;i<arrs.length;i++){
            temp[i]=arrs[i];//把数组arrs循环付过去
        }
        for(int i:temp){
            System.out.println(i);
        }
        arrs=temp;//把临时数组赋值给原数组，这时原数组已经扩容把临时数组赋值给原数组，这时原数组已经扩容
        System.out.println(arrs[5]);

        int [] arrs2= Arrays.copyOf(arrs,arrs.length+1);
        for (int i:arrs2
             ) {
            System.out.print(i);

        }
    }
}

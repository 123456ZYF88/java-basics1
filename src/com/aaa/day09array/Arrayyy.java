package com.aaa.day09array;

import java.util.Arrays;

public class Arrayyy {
    public static void main(String[] args) {
      /*  String[] strs=new String[3];
        for(String str:strs){
            System.out.println(str); //null的时候什么都不能干  就是没有指向
            System.out.println(str.length());

        }*/
       int[] arr=new int[]{1,2,3,4,5,6};
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }//拿一个进行下一个判断 是否大于或者小于 然后在进行赋值
            if(min>arr[i]){
                min=arr[i];
            }

        }
        System.out.println(max+","+min);
        int[] num={1,2,3};
        //参数1：数组对象
        //参数2：替换的值
        Arrays.fill(num, 6);
        System.out.println(Arrays.toString(num));
        int[] num1={4,2,3};
        int i=Arrays.binarySearch(num1,2);
        System.out.println(i);
    }
}

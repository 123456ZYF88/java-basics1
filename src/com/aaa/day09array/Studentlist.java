package com.aaa.day09array;

import java.util.Arrays;


public class Studentlist {
    public static void main(String[] args) {
        String[] ar=new String[]{"1","3","王五","4"};
        System.out.println(Arrays.toString(ar));
       int index= Arrays.binarySearch(ar,"王五");
        for(int i=index;i<ar.length-1;i++){
            ar[i]=ar[i+1];
        }
        ar=Arrays.copyOf(ar,ar.length-1);
        System.out.println(Arrays.toString(ar));
        boolean b=true?false:true;
        System.out.println(b);

    }
}

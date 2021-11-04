package com.aaa.day09array.zy;

import java.util.Arrays;

public class ArrayString {



    public static void main(String[] args) {
        String[] strings=new String[]{"一","上","收","是","都"};
        int b=Arrays.binarySearch(strings,"上");
        strings=Arrays.copyOf(strings,strings.length+1);
        for(int i=strings.length-1;i>b;i--){
            strings[i]=strings[i-1];
        }
        strings[b]="加";
        System.out.println(Arrays.toString(strings));

        for(int i=b;i<strings.length-1;i++){
            strings[i]=strings[i+1];

        }
        strings=Arrays.copyOf(strings,strings.length-1);
        System.out.println(Arrays.toString(strings));
    }
}

package com.aaa.day08abnormal;

public class GetMax {
    public static int getMAx(int[] arr) {

        int max =0;
        if(arr.length==0){
            throw new ArrayIndexOutOfBoundsException("数字中没有数据");

        }
        max =arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return  max;
    }
}

package com.aaa.day09array;

import java.util.Arrays;

public class ArrayCR {
    public static void main(String[] args) {
        int[] scores={100,99,98,97,60,96};
        int index=-1;//初始值< 0   这个是求下标
        for(int i=0;i<scores.length;i++){
            if(scores[i]==60){
                index=i;//求60这个下标 等于60的时候退出循环 这个时候i就是下标 吧i给index 就给出下标了
                break;
            }
        }
        //数组从后向 每一个数组的内容0向后移动一位  但是java的数组是固定长度的 使用就需要扩展新数组
        //换数组 ----扩展数组---扩展出来的是一个新的数组 开辟一个新的内存
        scores = Arrays.copyOf(scores,scores.length+1);
        //原来数组的长度6  新的数组的长度是7  新的int数组默认值最后一个为0
        System.out.println(scores);
        for(int i:scores){
            System.out.print(i+"\t");
        }
                //从最后一个的下标开始向后移动移动到这个要添加的下标是停止
        for(int i=scores.length-1;i>index;i--){
            scores[i]=scores[i-1];//吧前一个的值给下一个下标就相当于向后移动了

        }
        System.out.println();
        System.out.println("=========================");
        scores[index]=61;
        for(int i:scores){
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println("=========================");

         index=-1;//初始值< 0   这个是求下标
        for(int i=0;i<scores.length;i++){
            if(scores[i]==60){
                index=i;//求60这个下标 等于60的时候退出循环 这个时候i就是下标 吧i给index 就给出下标了
                break;
            }
        }
        for(int i=index;i<scores.length-1;i++){
            scores[i]=scores[i+1];
        }//长度减一
        scores=Arrays.copyOf(scores,scores.length-1);
        for(int i:scores){
            System.out.print(i+"\t");
        }
    }
}

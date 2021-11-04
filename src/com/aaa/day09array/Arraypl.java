package com.aaa.day09array;

public class Arraypl {
    public static void main(String[] args) {
        String strs[]=new String[]{"df","sd","sd"};
        for (int i=0;i<strs.length;i++){
            String temp =strs[i];
            System.out.print(temp+" ");
        }
        System.out.println("");
        for(String aa:strs){
            System.out.print(aa);
        }
        //俩两对比
        int[] scores={100,99,98,97,60,96};
        for(int j=1;j<scores.length;j++) {
            for (int i = 0; i < scores.length-j; i++) {
                if (scores[i] > scores[i + 1]) {//一个数大约下一个的时候就
                    //用了移动
                    int temp = scores[i];//temp变量 ： 暂存scores【i】
                    scores[i] = scores[i + 1];//scores[i]原来的位置已经被覆盖
                    scores[i + 1] = temp;
                }
            }
        }
        for(int i:scores){
            System.out.println(i+"\t");
        }
    }
}

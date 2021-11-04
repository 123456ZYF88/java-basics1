package com.aaa.day10gather;

public class HashMapTest {
    public static void main(String[] args) {
        /*注意需要的数据类型*/
        String[][] ints=new String[9][];//定义了第一重数组长度为9，里边的长度不定

        int [][] aa=new int[2][2];//d定义来数组，第一重长度为2，第二重也一起new 出来来啦但是2--两行  两列---四个格子
        /*
        二维数组
         数据类型 [][] 数组名 =new 数据类型 [第一重长度] [第二重长度]
        * */
        int [][] bb={{1,2,3},{11,22,33},{111,222,333}};
        for(int i=0;i<bb.length;i++){
            for (int  j=0;j<bb[i].length;j++){
                System.out.print(bb[i][j]+"\t");
            }
            System.out.println();
        }
            //开辟空间
        for (int i=0;i<ints.length;i++){
            ints[i]=new String[i+1];
        }
        //将乘法表的形式放到数组里面
        for (int i=0;i<ints.length;i++){
            for (int j=0;j<ints[i].length;j++){
                ints[i][j]=(i+1)+"*"+(j+1)+"="+(i+1)*(j+1);//给数组赋值
            }

        }
        //输出数组乘法表
        for (int i=0;i<ints.length;i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

package com.aaa.day09array;

public class Array {
    int [] h=new int[]{3,4,5,6};

    public static void main(String[] args) {
        int [] a=new int[10];

        int  b[]=new int[10];

        int c[]={1,2,3,4,5};


        Object[] objects= new Object[10];
        objects[1]=3;
        objects[2]="s";
        //定义Object类型的数组  可以放任意数据类型
        int d[]=new int[]{1,2,3,4,5,6,7};
        System.out.println(d[0]);//1
        System.out.println(d[6]);//7
        for(int i=0;i<c.length;i++){//长度循环输出
            System.out.println(c[i]);// 1,2,3,4,5
        }
        c[4]=10;
        System.out.println(c[4]);
        String e[]=new String[]{"sd","er","sd","sd"};
        boolean f[]=new boolean[]{true,false,true,false};
        System.out.println(f[0]);//true boolea也可以设置
        char g[]={'d','r','e'};
        System.out.println(g[0]);
        int[] j={4,45,6,7,};
        System.out.println(j.length);//4
        j=new int[9]; //这个时候是一个新的数组了  引用地址变了  以前的也没有消失等待内存释放Gc机制
        System.out.println(j.length+","+j[1]);
    }
}

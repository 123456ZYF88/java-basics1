package com.aaa.day02;

public class Zy {
    public static void main (String[]args) {
 /*      //1 考试成绩学院评奖系统
        //如果数学成绩大于80分并且语文成绩大于80分，获奖学金500元。2）如果数学小于30并且语文小于30分，输出重修。
        System.out.println("请输入语文成绩和数学");
        Scanner yw=new Scanner(System.in);
        int score1= yw.nextInt();
        Scanner sx=new Scanner(System.in);
        int score2= sx.nextInt();
        //判断
        if(score1>80 && score2>80){
            System.out.println("奖学金500元");
        }else if (score1<30 && score2<30){
            System.out.println("重修");
        }
*/
 /*      //2/两个数a、b，如果a能被b整除或a加b大于1000，则输出a，否则输出b
        System.out.println("请随便输入两个数");
        Scanner sc1=new Scanner(System.in);
        double a=sc1.nextDouble();
        Scanner sc2=new Scanner(System.in);
        double b= sc2.nextDouble();
        if(a%b==0 || a+b==1000) {
            System.out.println("a="+a);
        }else{
            System.out.println("b="+b);
        }*/
/*
    //:对学员的结业考试成绩评测 成绩>=90 ：优秀 成绩>=80 ：良好    成绩>=60 ：中等 成绩<60   ：差
        System.out.println("请输入成绩");
        Scanner sc=new Scanner(System.in);
        int score= sc.nextInt();
        //判断
        if(score>=90){
            System.out.println("优秀");
        }else if(score>=80){
            System.out.print("良好");
        }else if(score>=60){
            System.out.println("中等");
        }else {
            System.out.println("差");
        }
*/
/*        //输入考试成绩，显示所获奖励成绩==100分，爸爸给他买辆车,成绩>=90分妈妈给他买MP490分,>成绩>=60分妈妈给他买本参考书成绩,<60分什么都不买
        System.out.println("请输入成绩");
        Scanner sc=new Scanner(System.in);
        int score= sc.nextInt();
        //判断
        if(score==100){
            System.out.println("爸爸给他买辆车");
        }else if(score>=90){
            System.out.print("妈妈给他买MP4");
        }else if(score>=60){
            System.out.println("妈妈给他买本参考书");
        }else {
            System.out.println("什么都不买");
        }*/
/*  //:打印某年某月有多少天。（提示：A、闰年的计算方法：年数能被4整除，并且不能被100整除；或者能被400整除的整数年份。B、利用%运算可以判断一个数能否被另一个数整除。C、用CASE语句）
System.out.println("请输入年");
Scanner sc1=new Scanner(System.in);
        int year= sc1.nextInt();
        System.out.println("请输入月");
        Scanner sc2=new Scanner (System.in);
        int month=sc2.nextInt();
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("这个月有31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("这个月30天");
                break;
            case 2:
                //闰年的条件  能被400整除   或者  能被4整除并且不能被100整除
                if(year%400==0 || year%4==00 && year/100 !=0){
                    System.out.println("该月有29天");//闰年
                }else{
                    System.out.println("该月有28天");//
                }
                break;
            default:
                System.out.println("输入数据不合法");
                break;
        }*/
/*       // eg:张三为他的手机设定了自动拨号按1：拨爸爸的号按2：拨妈妈的号按3：拨爷爷的号 按4：拨奶奶的号
        System.out.println("输入号码  1：拨爸爸的号按2：拨妈妈的号按3：拨爷爷的号 按4：拨奶奶的号");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        switch (a){
            case 1:
                System.out.println("拨爸爸的号");
                break;
            case 2:
                System.out.println("拨妈妈的号");
                break;
            case 3:
                System.out.println("拨爷爷的号");
                break;
            case 4:
                System.out.println("拨奶奶的号");
                break;

        }*/
/*        //输入一个数，判断它是否能被3、5、7整除，注意考虑同时整除的情况
        System.out.println("请输入一个数");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        if(a%3==0 && a%5==0 && a%7==0){
            System.out.println("这个是能同时被3、5、7整除");
        }else if(a%3==0 || a%5==0 || a%7==0){
            System.out.println("这个是能被3、5、7整除");
        }*/
/*    //对一批货物征收税金（长整型）。价格在1万元及以上的货物征税5%，在5000元及以上，1万元以下的货物征税3%，在1000元及以上，5000元以下的货物征税2%，1000元以下的货物免税。编写一程序，读入货物价格，计算并输出税金。
    System.out.println("你的货是多少钱");
    Scanner sc=new Scanner(System.in);
    int a= sc.nextInt();
        //判断
    if (a>10000){
        long b=a+(a*5/100);
        System.out.println("税金"+ b+"元");
    }else if(a>5000 && a<10000 ){
        long b=a+(a*3/100);
        System.out.println("税金"+b+"元");
    }else if (a>1000 && a<5000){
        long b=a+(a*2/100);
        System.out.println("税金"+b+"元");
    }else if(a<1000){

        System.out.println("你免了");
    }*/
/*       // 输入一组成绩求最大值并输出
        System.out.println("请输入三个成绩");
        Scanner sc1=new Scanner(System.in);
        int a=sc1.nextInt();
        Scanner sc2 =new Scanner( System.in);
        int b=sc2.nextInt();
        Scanner sc3=new Scanner(System.in);
        int c=sc3.nextInt();
        if (a>b){
            if(a>c){
                System.out.println("最大成绩="+a);
            }else{
                System.out.println("最大成绩="+c);
            }
        }else if(a<b){
            if(b>c){
                System.out.println("最大成绩="+b);
            }else{
                System.out.println("最大成绩="+c);
            }
        }else if(b==a) {
            if (a > c) {
                System.out.println("最大成绩=" + a + "和" + b);
            } else {
                System.out.println("最大成绩=" + c);
            }
        }*/
/*    //从今天开始循环日期，一直到22大家可以不上课可以放假回家
        for( int a=3;a<22;a++){
            System.out.println(a+"号回家");
        }*/
/*       // 计算1-100之和
        int a=0;
        for(int i=1;i<=100;i++){
            a+=i;

        }
        System.out.println(a);*/
/*        //列出1-1000以内所有的奇数和偶数
        for(int i=1;i<=1000;i++){
            if(i%2==0){
                System.out.println("偶数"+i);
            }else{
                System.out.println("奇数"+i);
            }


        }*/
/*       // 99乘法表
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+"\0");
            }
            System.out.println();
        }*/
/*        //水仙花数：153？ 1*1*1+5*5*5+3*3*3=153
        System.out.println("请输入一个数");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int g=a%10;//g个为位数
        int sei=a%100/10;//十位
        int b=a/100;//百
        if(g*g*g+sei*sei*sei+b*b*b==a){
            System.out.println(true+"是水仙花");
        }else{
            System.out.println(false+"不是");
        }*/
/*      //  篮球从5米高的地方掉下来，每次弹起的高度是原来的30%，经过几次弹起，篮球的高度小于0.1米。

       double b=5.0;
        int c=1;
        while (b>0){
            b*=0.3;

            if(b<0.1){
                System.out.println(c);
                break;
            }
            c++;
            }
        int sum=0;
        for(double he=5;he>0.1;he=he*0.3){
            sum=sum+1;
        }
    System.out.println(sum);*/
/*     //列出1000以内所有的质数
        //质数：除了1和本身其他都不能整除就叫质数
        int i,j;
        for( i=2;i<=1000;i++){
            for (j=2;j<i;j++) {
                if (i % j==0) {
                    break;//若能整除，说明该数除了被1和它本身   整除还能被其他数整除，固不是质数，则跳出循环
                }
            }
                if(i==j){
                    System.out.print(j+" ");
                }
            }*/
/*        //输入A和B两个值，计算出他俩饿最小公倍数和最大公因数（最大公约数）
        System.out.println("输入两个数");
        Scanner sc1=new Scanner(System.in);
        int a=sc1.nextInt();
        Scanner sc2=new Scanner (System.in);
        int b=sc2.nextInt();
        int max=a<b ? b:a;
       // int min=a<b ? a:b;
        int i;
        for(i=max;i>0;i++){
            if(i%a==0 &&i%b==0){
                System.out.println("最小公倍数="+i);
                break;
                }
            }
        int r=0;
       if (a==0 || b==0){
           System.out.println(a==0 ? b:a);
       }else{
           for(i=2;i<=a&&i<=b;i++){
               if(a%i==0&&b%i==0){
                   r=i;
               }
           }
           System.out.println( "最大公约数"+r);
       }*/
/*        //公鸡2文，母鸡1文，小鸡半文，每种至少一只，100文买100只鸡有多少可能性。百钱买百鸡。
        int  cock=2,hen=1;
        double chick=0.5;
        int a=1;
        while (a<50){
            int i=1;

            while (i<100){
                int j=1;

                while (j<200){
                    if(a*cock+i*hen+j*chick==100 && a+i+j==100){
                        System.out.println("公鸡:"+a+"母鸡:"+i+"小鸡:"+j);
                    }j++;

                } i++;

            }a++;
        }*/

/*       // 鸡兔同笼：总共100个脚，各多少  2*x+4*y=100
        int x=1;
        while (x<50){
            int y=1;
            while (y<25){
                if(2*x+y*4==100 ){
                    System.out.println( "鸡"+x+",兔"+y);
                }y++;
            }x++;
        }*/

/*        //羽毛球拍15元，球3元，水2元。200元每种至少一个，有多少可能
        int y=1;
        while (y<14){
            int q=1;
            while (q<62){
                int s=1;
                while(s<92){
                    if((y*15+q*3+s*2)==200){
                        System.out.println("羽毛球："+y+",球："+q+",水："+s);
                    }s++;
                }q++;
            }y++;
        }*/
/*        //continue  求1-100的奇数
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                continue;
            }
            sum+=i;
        }
        System.out.println(sum);*/
/*//*******
        PrintRectangle(3, 5);
        PrintRectangle(2, 4);
        PrintRectangle(6, 10);
    }
        public static void PrintRectangle (int height, int width){
            for (int i=0;i<height;i++){
                for(int j=0;j<width;j++){
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }*/

    }
}

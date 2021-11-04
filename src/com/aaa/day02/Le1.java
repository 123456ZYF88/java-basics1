package com.aaa.day02;


public class Le1 {

    int sum ;
    int max;
    int sum(int num1,int num2){
        return  num1+num2;
    }
    int max(int num1,int num2){
        num1=num1>num2 ? num1:num2;
        return  num1;
    }

 /*   public  static  void main (String [] args){
        System.out.println("请输入两个数 得出最大值和 两个数的和");
        Le1 js=new Le1();
        Scanner sc1=new Scanner(System.in);
        int a= sc1.nextInt();
        Scanner sc2=new Scanner(System.in);
        int b= sc2.nextInt();
        int  Max=js.max(a,b);
        int Sum= js.sum(a,b);
        System.out.println("和是："+Sum+",最大："+Max);
    }*/



/*
* （1）字段：身份证号idCard，姓名name,性别gender，年龄age，职业profession，联系方式phone。并定义相应的属性；
  （2）定义函数message()输出个人的基本信息。
* */
/*    long idCard;
    String name;
    String gender;
    int age;
    String profession;
    int  phone;
    public void message(){
        System.out.println("姓名："+name+",性别"+gender+",年龄"+age+",职业"+phone+",身份证："+idCard);
    }
    public  static  void main(String []args){
        Le1 wyf=new Le1();
        wyf.name="吴亦凡";
        wyf.age=30;
        wyf.gender="男";
        wyf.idCard=345234524564632L;
        wyf.profession="强奸犯";
        wyf.message();
    }*/


/*            String name;//姓名
            String nn;//国籍
            int age;//年龄
            int prison;//行期
            public String eat(){
            System.out.println("强奸犯："+name+","+nn+","+age+"岁,"+"判刑"+prison);
            return "已经逮捕";
            }*/
      /*  public static void main (String []args){
            Le1 wyf=new Le1();
            wyf.name="吴亦凡";
            wyf.nn="加拿大";
            wyf.age=30;
            wyf.prison=30;
           // wyf.eat();
            String str=wyf.eat();
            System.out.println(str);
        }*/

}

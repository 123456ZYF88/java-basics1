package com.aaa.day03;

public class Sell {
    static int tickets=10;//10张门票
    String name;
   // 卖票案例    三个人 卖   10张票
    public Sell(String name) {
        this.name = name;
    }
    public  void ticket(){
        System.out.println(name+"卖出一张票，剩余"+--tickets+"票");
    }
   public static void main(String[] args) {

        while (tickets>0) {
            if(tickets>0){
                Sell wang=new Sell("王启文");
                wang.ticket();
            }
            if(tickets>0){
                Sell ang=new Sell("如来佛祖");
                ang.ticket();
            }
            if(tickets>0){
                Sell an=new Sell("迪迦");
                an.ticket();
            }

    }
}

}

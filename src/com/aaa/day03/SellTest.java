package com.aaa.day03;

import static com.aaa.day03.Sell.tickets;

public class SellTest {
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

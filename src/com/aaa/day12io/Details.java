package com.aaa.day12io;

public class Details {
      String proname ;
      int price;
      int num;
    public void Details(){

    }
    public Details(String proname, int price, int num) {
        this.proname = proname;
        this.price = price;
        this.num = num;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Details{" +
                "名字='" + proname + '\'' +
                ", 价格=" + price +
                ", 价格" + num +
                '}';
    }
}

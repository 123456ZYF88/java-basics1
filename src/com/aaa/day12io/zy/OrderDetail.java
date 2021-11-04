package com.aaa.day12io.zy;

public class OrderDetail {
    private  String proname;
    private  double price;
    private  int num;
    public OrderDetail(){

    }

    public OrderDetail(String proname, double price, int num) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
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
        return "{" +
                "商品名字='" + proname + '\'' +
                ", 价格=" + price +
                ", 数量=" + num +
                '}';
    }
}

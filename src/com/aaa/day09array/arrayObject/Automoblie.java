package com.aaa.day09array.arrayObject;

import javax.naming.PartialResultException;
import java.util.Arrays;

public class Automoblie {
    public static void main(String[] args) {
       ParkManager parkManager=new ParkManager();
       parkManager.add(new Park("a",34444));
       parkManager.add(new Park("g",3444));
       parkManager.add(new Park("b",344));
       parkManager.add(new Park("f",44));
      parkManager.print();

      int i=parkManager.index(new Park("b",344));
        System.out.println(i);
        parkManager.delete(new Park("b",344));
        parkManager.print();
        System.out.println("==============================");
        parkManager.alter(new Park("g",3444),new Park("G",3444));
        parkManager.print();
    }
}

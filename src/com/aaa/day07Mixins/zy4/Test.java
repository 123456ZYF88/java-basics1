package com.aaa.day07Mixins.zy4;

public class Test {
        private Printer com;
    void paly(String name){
        com.print(name);
    }

    public Printer getCom() {
        return com;
    }

    public void setCom(Printer com) {
        this.com = com;
    }

    public static void main(String[] args) {
     /*   Printer a=new Colours();
        a.print("身份证");//
        Colours b=new Colours();
        b.print("身份证");

        Black c=new Black();
        c.print("照片");*/
        Test test=new Test();
        test.setCom(new Black());
        test.paly("身份证");
    }
}

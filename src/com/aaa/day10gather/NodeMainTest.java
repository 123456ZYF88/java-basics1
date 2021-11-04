package com.aaa.day10gather;

public class NodeMainTest {
    public static void main(String[] args) {


        /*
        *
        * */
        NodeEntity zs=new NodeEntity();//创建对象节点
        zs.setData("张三");
        NodeEntity ls=new NodeEntity();
        ls.setData("李四");
        /*创建 张三 和李四 张三的下一个是李四  李四的上一个是张三*/
        zs.setNext(ls); ls.setPrev(zs);
        NodeEntity nodeEntity=zs;//循环  先调用zs  然后以是否为空来判断循环  通过getDate输出
        while (nodeEntity!=null){
            System.out.println(nodeEntity.getData());//输出
            nodeEntity=nodeEntity.getNext();//吧下一个的地址赋值 然后继续循环判断
        }
        System.out.println("==================================");
        /*在下一个添加王五*/
        NodeEntity wu=new NodeEntity();
        wu.setData("王五");
        wu.setPrev(ls); ls.setNext(wu);
        nodeEntity=zs;
        while (nodeEntity!=null){
            System.out.println(nodeEntity.getData());//输出
            nodeEntity=nodeEntity.getNext();//吧下一个的地址赋值 然后继续循环判断
        }
        System.out.println("=============================");
      /*  李四和王五之间插入一个aaa*/
        //setNext下一个 setPrev上一个
        NodeEntity aaa=new NodeEntity();
        aaa.setData("aaa");
        ls.setNext(aaa);//下一个
        aaa.setPrev(ls);//上一个
        wu.setPrev(aaa);//上一个
        aaa.setNext(wu);//下一个
        nodeEntity=zs;
        while (nodeEntity!=null){
            System.out.println(nodeEntity.getData());//输出
            nodeEntity=nodeEntity.getNext();//吧下一个的地址赋值 然后继续循环判断
        }


    }
}

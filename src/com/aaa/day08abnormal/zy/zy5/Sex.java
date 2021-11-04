package com.aaa.day08abnormal.zy.zy5;

class XBException extends RuntimeException{
    public XBException(String a) {
        super(a);
    }
}
class nlException extends  RuntimeException{
    public nlException(String a) {
        super(a);
    }
}

public class Sex {
    private int age;
    private String sex;

/*    void pd(int age ,String sex){
        if(sex=="男"||sex=="女"){
            throw new XBException("性别只能男女");
        }
        if(age>100){
            throw new XBException("年龄不能大于100");
        }
    }*/
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>100){
            throw new XBException("年龄不能大于100");
        }
        this.age = age;
    }

    public String getSex() {

        return sex;
    }

    public void setSex(String sex) {
        if("男".equals(sex)||"女".equals(sex)){
            this.sex = sex;
        }else{
            throw new nlException("性别只能男女");
        }

    }

    public static void main(String[] args) {
        Sex sex=new Sex();

        try{
            sex.setSex("撒");

            sex.setAge(100);

        }catch (XBException e){
            e.printStackTrace();
        }catch (nlException b){
            b.printStackTrace();
        }



    }

}

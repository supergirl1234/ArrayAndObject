package com;

/**
 * Author:Fanleilei
 * Created:2019/2/6 0006
 */
public class Test2 {
    public static void main(String[] args) {
      Person person=new Person("李四",22,"我是一个大学生","女");
        System.out.println(person.PersonInfo());
    }
}
class Person{

    //属性
    private  String name;
    private int age;
    private String secret;
    private String gender;

    //构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
     //构造参数重载
    public Person(String name, int age, String secret) {
       this(name,age);//this调用放在构造方法中的第一条语句
        this.secret = secret;
    }

    public Person(String name, int age, String secret, String gender) {

        this(name,age,secret);
        this.gender = gender;
    }
    //getXxx()方法  Xxx属性名称
    //setXxx()方法


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSecret() {
        return secret;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //方法，行为
    public String PersonInfo(){

        return "名字："+name+" 年龄："+age+" 秘密："+secret+" 性别："+gender;
    }
}
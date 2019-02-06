package com;

/**
 * Author:Fanleilei
 * Created:2019/2/6 0006
 */
public class Test3 {
    public static void main(String[] args) {

        //对象1
        Person person1=new Person("Jack",12);
        //setter、getter方法
        //赋值
        person1.setGender("男");
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.PersonInfo());

        //Person类的属性是私有的private，受到保护
        //System.out.println(person1.age);//error，这种方法是获取不到person1的属性值的
        System.out.println(person1.getAge());//要通过getter方法来获取

       //Person person=new Person();//error,这种创建对象的方法在Person类中是不存在的，因为没有无参得构造方法
        //所以通过构造方法重载，我们可以创建出不同属性信息的对象
        Person person2=new Person("张三",12);
        Person person3=new Person("李四",12,"我是");
        Person person4=new Person("王五",12,"我是","男");


        System.out.println(person2.PersonInfo());
        System.out.println(person3.PersonInfo());
        System.out.println(person4.PersonInfo());


        //匿名对象

        System.out.println(new Person("Tom",10).PersonInfo());
    }

}
class App{

    //如果没有构造方法，java会自动创建一个
    public App(){

    }
}
package com;

/**
 * Author:Fanleilei
 * Created:2019/2/6 0006
 */
public class Test1 {

    public static void main(String[] args) {

        int age=2;
        String name="六儿";
        Dog dog=new Dog(name,age);
        int x=age-1;
        if(x>1){
            dog.play();
        }else{
            dog.bark();
        }


    }
}
class Dog{
    private String name;
    private Integer age;

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public void play(){

        System.out.println(this.name+"want to play");
    }
    public  void bark(){

        System.out.println(this.name+"汪汪");
    }
}

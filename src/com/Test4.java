package com;

/**
 * Author:Fanleilei
 * Created:2019/2/6 0006
 */
public class Test4 {

    public static void main(String[] args) {
        Car car=new Car(12345,"红色","宝马");
        car.ride();
        System.out.println(car.toString());
        System.out.println(car.getBrand());
    }
}
class Car{
    //属性
    private int num;
    private  String color;
    private String brand;

    //构造方法

    public Car(int num, String color, String brand) {
        this.num = num;
        this.color = color;
        this.brand = brand;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNum() {
        return num;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public void ride(){

        System.out.println("汽车可以在马路上行驶");
    }

    @Override
    public String toString() {
        return "car{" +
                "num=" + num +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
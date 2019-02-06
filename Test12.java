package com;

/**
 * Author:Fanleilei
 * Created:2019/2/6 0006
 */
public class Test12 {
    //打印数组
    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();

    }

    //计算数组中最大值
    public static int  arrayMax(int[] data){

        if(data==null){

            throw new IllegalArgumentException("数组中数据不能为空");
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<data.length;i++){
            if(max<data[i]){
                max=data[i];
            }

        }
        return max;
    }
    //计算数组中最小值
    public static int  arrayMin(int[] data){

        if(data==null){

            throw new IllegalArgumentException("数组中数据不能为空");
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<data.length;i++){
            if(min>data[i]){
                min=data[i];
            }

        }
        return min;
    }
    //3.计算数组值之和
    public static int arraySum(int [] data){
        if(data == null){
            throw new IllegalArgumentException("数组中数据不能为空");
        }
        int sum = 0;
        for(int i=0; i<data.length; i++){
            sum=sum+data[i];
        }
        return sum;
    }
    //4.数组拼接
    public static int[] arrayJoin(int[] x,int[] y) {

        if(x == null){
            throw new IllegalArgumentException("数组中数据不能为空");
        }
        if(y== null){
            throw new IllegalArgumentException("数组中数据不能为空");
        }
        int[] zuhe=new int[x.length+y.length];
        for(int i=0;i<x.length;i++){
            zuhe[i]=x[i];
        }
        for(int i=x.length;i<x.length+y.length;i++){
            zuhe[i]=y[i-x.length];

        }
        return zuhe;


    }
    //数组截取
    //[start,end)
    public static int[] arraySub(int[] data,int start,int end) {

        if(data==null){
            throw new IllegalArgumentException("数组不能为空");
        }
        if(start<0||end<0){
            throw new IllegalArgumentException("start、end不能小于0");

        }
        if(end<start){
            throw new IllegalArgumentException("end不能小于start");

        }
        if(start>=data.length){
            throw new IllegalArgumentException("start不能超过数组的长度");
        }
        if(end>data.length){

            throw new IllegalArgumentException("end不能超过数组的长度");
        }
        if(end-start>data.length){
            throw new IllegalArgumentException("截取的长度不能超过数组的长度");
        }
        int[] result=new int[end-start];
        for(int i=start;i<end;i++){
            result[i-start]=data[i];

        }
        return result;
    }
    public static void main(String[] args) {

        int[] data1=new int[]{2,4,6,9,0};
        int[] data2=new int[]{4,6,8,3,1};
        int result1=arrayMax(data1);
        int result2=arrayMin(data1);
        int[] result3=arrayJoin(data1,data2);
        System.out.println("最大值："+result1);
        System.out.println("最小值："+result2);
        System.out.print("数组拼接之后：");
        printArray(result3);

        System.out.print("截取数组：");
        int[] result4=arraySub(data1,4,5);
        printArray(result4);
    }
}

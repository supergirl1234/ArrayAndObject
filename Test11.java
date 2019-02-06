package com;


import java.util.Arrays;

/**
 * Author:Fanleilei
 * Created:2019/2/6 0006
 */
public class Test11 {
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

    public static void printArray(char[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();

    }

    //求数组的最大值、最小值、平均值、总和


    public static int[] computeArr(int[] data) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int avg = 0;

        for (int i = 1; i < data.length; i++) {
            //求最大值
            if (max < data[i]) {
                max = data[i];

            }
            //求最小值
            if (min > data[i]) {
                min = data[i];

            }
            //求总和
            sum += data[i];
        }

        //平均值
        avg = sum / data.length;
        return new int[]{max,min,sum,avg};
    }


    public static void main(String[] args) {


        //System.arraycopy数组拷贝
        //Arrays.copyOf数组拷贝
        // Arrays.sort数组排序
        int[] src=new int[]{1,2,3,4,5,6,7};
        int[] dest=new int[5];
        printArray(src);
        printArray(dest);
        System.arraycopy(src,1,dest,0,5);
        System.out.println("通过arraycopy之后：");
        printArray(src);
        printArray(dest);
        System.out.println("Arrays.copyOf之后：");
        int[] xin=Arrays.copyOf(src,6);
        printArray(xin);

        System.out.println("排序");
        int[] arr1=new int[]{2,1,6,4,9,0};
        char[] arr2=new char[]{'y','a','v','s','f'};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        printArray(arr1);
        printArray(arr2);


        int[] data=new int[]{1,4,8,5,8};
        int[] result=computeArr(data);
        int max=result[0];
        int min=result[1];
        int sum=result[2];
        int avg=result[3];
        System.out.println("最大值:"+result[0]);
        System.out.println("最小值:"+result[1]);
        System.out.println("总和:"+result[2]);
        System.out.println("平均值:"+result[3]);

    }
}

package com.itheima.test;

import java.util.Random;

public class Test05 {
    public static void main(String[] args) {

        int[] arr=new int[10];
        Random r=new Random();

        for(int i=0;i<10;i++)
        {
            arr[i]=r.nextInt(100)+1;//将10个随机数依次录入
        }

        int sum=0;
        for (int i = 0; i < 10; i++) {
            sum+=arr[i];
        }
        System.out.println("各项和为"+sum);

        int average=sum/10;
        System.out.println("平均值为"+average);

        int count=0;
        for (int i = 0; i <10; i++) {
            if(arr[i]<average)count++;
        }
        System.out.println("比平均值小的值有"+count+"个");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

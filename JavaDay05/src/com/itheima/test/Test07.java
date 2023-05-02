package com.itheima.test;

import java.util.Random;

public class Test07 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        Random r=new Random();

        //打乱所有顺序
        //难点：获得随机索引

        for (int i = 0; i <arr.length; i++) {

            int RandIndex=r.nextInt(arr.length);
            int temp= arr[i];
            arr[i]=arr[RandIndex];
            arr[RandIndex]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}

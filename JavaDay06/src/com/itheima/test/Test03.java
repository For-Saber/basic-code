package com.itheima.test;

public class Test03 {
    public static void main(String[] args) {

        int[] arr = {12, 45, 98, 73, 60};
        getMax(arr);
    }
    public static void getMax(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max)max=arr[i];
        }
        System.out.println("最大值为"+max);
    }
}

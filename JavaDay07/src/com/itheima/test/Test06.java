package com.itheima.test;

public class Test06 {
    public static void main(String[] args) {

        int[] arr = {1, 9, 8, 3};
        int num=0;

        for (int i = 0;  i< arr.length; i++) {
            arr[i]+=5;
            arr[i]%=10;
        }

        for (int i = arr.length-1; i >=0; i--) {
            num=num*10+arr[i];
        }

        System.out.println("加密后结果为："+num);
    }
}

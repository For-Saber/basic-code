package com.itheima.test;

import java.util.Random;

public class Test03 {

    public static void main(String[] args) {
        //随机打乱字符串

        String str="abcdefg";
        char[] arr=str.toCharArray();
        arr=randomSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static char[] randomSort(char[] arr){

        Random r=new Random();
        char temp;

        for (int i = 0; i < arr.length; i++) {
            temp=arr[i];
            int index=r.nextInt(arr.length);
            arr[i]=arr[index];
            arr[index]=temp;
        }
        return arr;
    }

}

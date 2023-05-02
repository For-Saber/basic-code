package com.itheima.test;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {

        int[] arr={1,5,8,12,56,89,34,67};
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入查询的数字：");
        num=sc.nextInt();

       boolean flag= contain(arr,num);
        System.out.println(flag);

    }
    public static boolean contain(int[] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num)return true;
        }
        return false;
    }

}

package com.itheima.test;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        System.out.println("请输入第一个整数：");
        Scanner sc1=new Scanner(System.in);
        int a=sc1.nextInt();
        System.out.println("请输入第二个整数：");
        Scanner sc2=new Scanner(System.in);
        int b=sc1.nextInt();
        boolean result=a==6||b==6||(a+b)%6==0;
        System.out.println(result);
    }
}

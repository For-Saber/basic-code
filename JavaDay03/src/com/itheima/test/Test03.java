package com.itheima.test;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        System.out.println("输入第一只老虎体重：");
        Scanner sc1=new Scanner(System.in);
        int a= sc1.nextInt();
        System.out.println("输入第二只老虎体重：");
        Scanner sc2=new Scanner(System.in);
        int b= sc2.nextInt();
        String result=a==b?"相同":"不同";
        System.out.println(result);
    }
}

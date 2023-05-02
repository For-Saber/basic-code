package com.itheima.test;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        System.out.println("输入第一个数：");
        Scanner sc1=new Scanner(System.in);
        int num1= sc1.nextInt();
        System.out.println("输入第二个数：");
        Scanner sc2=new Scanner(System.in);
        int num2= sc2.nextInt();
        System.out.println("输入第三个数：");
        Scanner sc3=new Scanner(System.in);
        int num3= sc3.nextInt();
        if(num1<num2){
            if (num1<num3) System.out.println(num1);
            else System.out.println(num3);
        }
        else{
            if(num2<num3) System.out.println(num2);
            else System.out.println(num3);
        }
    }
}

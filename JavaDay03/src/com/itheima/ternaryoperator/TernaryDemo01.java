package com.itheima.ternaryoperator;

import java.util.Scanner;

public class TernaryDemo01 {
    public static void main(String[] args) {
        //比大小
        Scanner sc1=new Scanner(System.in);
        int a= sc1.nextInt();
        Scanner sc2=new Scanner(System.in);
        int b= sc2.nextInt();
        System.out.println(a>b?a:b);
    }
}

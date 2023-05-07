package com.itheima.stringdemo;

import java.util.Scanner;

public class StringBuilderDemo3 {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder();
        Scanner sc= new Scanner(System.in);

        String str=sc.next();
        if (sb.append(str).reverse().toString().equals(str)){
            System.out.println("是");
        }
        else System.out.println("否");
    }
}

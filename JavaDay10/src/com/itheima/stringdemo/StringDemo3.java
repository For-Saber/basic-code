package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {

        //键盘录入字符串并进行遍历
        Scanner sc=new Scanner(System.in);

        String s=sc.next();
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
    }
}

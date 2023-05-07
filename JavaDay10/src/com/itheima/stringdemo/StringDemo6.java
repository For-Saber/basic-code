package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String result=reverseStr(s);
        System.out.println(result);

    }

    public static String reverseStr(String str) {

        String newStr = "";

        for (int i = str.length()-1; i >= 0; i--) {
            char c = str.charAt(i);
            newStr += c;
        }
        return newStr;
    }
}

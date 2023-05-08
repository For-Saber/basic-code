package com.itheima.test;

import java.util.Scanner;

public class Test06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("请输入单词串:");
        String str=sc.nextLine();
        String result=getLastWord(str);
        System.out.println(result);
    }

    public static String getLastWord(String str){
        for (int i = str.length()-1; i >= 0; i--) {
            if (str.charAt(i)==' ')return str.substring(i+1);
        }
        return str;
    }
}

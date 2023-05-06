package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {

        //键盘录入字符串并进行遍历
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int smallCount = 0;
        int capsCount = 0;
        int numCount = 0;

        for (int i = 0; i < s.length(); i++) {

            char chs = s.charAt(i);

            if (chs >= 'a' && chs <= 'z') smallCount++;
            else if (chs >= 'A' && chs <= 'Z') capsCount++;
            else if (chs >= '0' && chs <= '9') numCount++;
        }
        System.out.println("小写字母："+smallCount);
        System.out.println("大写字母："+capsCount);
        System.out.println("数字："+numCount);
    }
}

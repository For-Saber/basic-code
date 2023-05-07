package com.itheima.test;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        //罗马数字转换

        Scanner sc = new Scanner(System.in);
        String str;

        while (true) {
            System.out.println("请输入9位以内阿拉伯数字：");
            str = sc.next();
            int i;
            if (str.length() <= 9) {

                for (i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    if (c < '0' || c > '9') {
                        System.out.println("输入错误请重新输入！");
                        break;
                    }
                }
                if (i == str.length()) break;
            } else System.out.println("输入超出范围！");
        }

        System.out.println(getAll(str));
    }

    public static String getRomanNumber(int num) {

        String[] arr = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return arr[num];
    }

    public static String getAll(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            sb.append(getRomanNumber(c - 48)).append(" ");

        }
        return sb.toString();
    }
}

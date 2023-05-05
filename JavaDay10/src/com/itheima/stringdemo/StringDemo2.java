package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctName = "ForSaber";
        String correctPass = "qwer78523";
        int i;

        for (i = 0; i < 3; i++) {

            System.out.println("请输入用户名：");
            String name = sc.next();

            if (name.equals(correctName)) {
                System.out.println("请输入密码：");
                String password = sc.next();
                if (password.equals(correctPass)) {
                    System.out.println("登陆成功！");
                    break;
                } else if (i == 2) {
                    System.out.println("密码错误！");
                } else {
                    System.out.println("密码错误！还剩" + (2 - i) + "次机会");
                }
            } else if (i == 2) {
                System.out.println("用户名不存在！");
            } else {
                System.out.println("用户名不存在！还剩" + (2 - i) + "次机会");
            }
        }
        if (i == 3) System.out.println("登陆失败！账户被锁定。");
    }
}

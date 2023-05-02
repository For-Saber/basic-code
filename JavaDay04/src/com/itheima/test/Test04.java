package com.itheima.test;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("请输入存入金额：");
            Scanner sc1 = new Scanner(System.in);
            int Money = sc1.nextInt();
            if (Money <= 0) System.out.println("请输入正确金额数！");
            else if (Money > 0 && Money < 1000) System.out.println("最低额度1000元！");
            else {
                System.out.println("请选择存入年限：（存期分为一年、两年、三年、五年）");
                Scanner sc2 = new Scanner(System.in);
                int Time = sc2.nextInt();
                Double FinalMoney = 0.0;
                switch (Time) {
                    //暂时没有想到更合适的错误输入的处理办法
                    case 1 -> {
                        FinalMoney = Money + Money * 0.0225;
                        System.out.println("本息总额为" + FinalMoney);
                    }

                    case 2 -> {
                        FinalMoney = Money + Money * 0.027 * 2;
                        System.out.println("本息总额为" + FinalMoney);
                    }
                    case 3 -> {
                        FinalMoney = Money + Money * 0.0325 * 3;
                        System.out.println("本息总额为" + FinalMoney);
                    }
                    case 5 -> {
                        FinalMoney = Money + Money * 0.036 * 5;
                        System.out.println("本息总额为" + FinalMoney);
                    }
                    default -> System.out.println("年限选择错误！");
                }
            }
        }
    }
}

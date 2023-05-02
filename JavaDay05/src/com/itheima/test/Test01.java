package com.itheima.test;

public class Test01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

//            if(i%7!=0&&i%10!=7&&i/10!=7) System.out.printf(String.valueOf(i+" "));
//            else System.out.printf("过 ");

//            if (i%7==0||i/10==7||i%10==7) System.out.printf("过 ");
//            else System.out.printf(String.valueOf(i+" "));

            if (i % 7 == 0 || i / 10 == 7 || i % 10 == 7) {
                System.out.printf("过 ");
                continue;
            }
            System.out.printf(String.valueOf(i + " "));
        }
    }
}

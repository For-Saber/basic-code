package com.itheima.test;

public class Test02 {
    public static void main(String[] args) {
        int NewMobilePrice = 7988;
        int OldMobilePrice = 1500;
        double cost1 = NewMobilePrice - OldMobilePrice;
        double cost2 = NewMobilePrice * 0.8;
        if (cost1 > cost2) System.out.println("应该以旧换新");
        else System.out.println("不应该以旧换新");
    }
}

package com.itheima.test;

public class Test09 {
    public static void main(String[] args) {

        double paper = 0.1;
        double mountain = 8844430.0;
        int count = 0;

        while (paper < mountain) {
            paper = paper * 2;
            count++;
        }

        System.out.println(count);
    }

}

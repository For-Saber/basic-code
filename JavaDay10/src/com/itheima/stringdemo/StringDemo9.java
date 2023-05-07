package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo9 {

    public static void main(String[] args) {

        String words;
        Scanner sc = new Scanner(System.in);

        words = sc.next();
        String result = words.replace("TMD", "***");
        System.out.println(result);
    }
}

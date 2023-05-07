package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo10 {

    public static void main(String[] args) {

        String words;
        Scanner sc = new Scanner(System.in);
        String[] arr = {"TMD","GDX","ctmd","ZZ","lj","FW","nt"};

        words = sc.next();
        for (int i = 0; i < arr.length; i++) {
            words=words.replace(arr[i],"***");
        }

        System.out.println(words);

    }
}

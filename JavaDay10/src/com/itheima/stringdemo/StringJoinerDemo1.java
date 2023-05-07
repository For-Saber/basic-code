package com.itheima.stringdemo;

import java.util.StringJoiner;

public class StringJoinerDemo1 {

    public static void main(String[] args) {

        StringJoiner sj=new StringJoiner(",","[","]");
        sj.add("1").add("2").add("3");
        System.out.println(sj);
    }
}

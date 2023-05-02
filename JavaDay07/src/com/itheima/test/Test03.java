package com.itheima.test;

import java.util.Random;

public class Test03 {
    public static void main(String[] args) {

        //验证码生成
        char[] chs = new char[52];
        //将大小写字母放入一个字符数组中

        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) chs[i] = (char) (97 + i);
            else chs[i] = (char) (65 + i - 26);
        }

        String result = "";
        for (int i = 0; i < 4; i++) {
            result += getChar(chs);
        }

        Random r = new Random();
        int num=r.nextInt(10);
        result += num;

        System.out.println(result);
    }

    public static char getChar(char[] chs) {
        Random r = new Random();
        int index = r.nextInt(chs.length);
        return chs[index];
    }
}

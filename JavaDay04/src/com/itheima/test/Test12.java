package com.itheima.test;

public class Test12 {
    public static void main(String[] args) {
        //输出从1949年到2019年中所有是猪年的年份
        for (int i = 1949; i < 2019; i++) {
            if ((2019 - i) % 12 == 0) System.out.println(i + "年是猪年");
        }
    }
}

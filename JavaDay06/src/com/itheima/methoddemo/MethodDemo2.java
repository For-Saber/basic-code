package com.itheima.methoddemo;

public class MethodDemo2 {
    public static void main(String[] args) {
        compare(10,20);
        compare(10L,20L);
        compare((byte)10,(byte)20);
        compare((short) 10,(short)20);
    }

    public static void compare(int a, int b) {
        if (a == b) System.out.println("两数相等");
        else System.out.println("不相等");
    }

    public static void compare(long a, long b) {
        if (a == b) System.out.println("两数相等");
        else System.out.println("不相等");
    }

    public static void compare(byte a, byte b) {
        if (a == b) System.out.println("两数相等");
        else System.out.println("不相等");
    }

    public static void compare(short a, short b) {
        if (a == b) System.out.println("两数相等");
        else System.out.println("不相等");
    }
}

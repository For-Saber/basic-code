package com.itheima.test;

public class Test02 {

    public static void main(String[] args) {

        String strA = "abcde";
        String strB = "cdeab";

        System.out.println(isRotate(strA, strB));

    }

    public static String rotateString(String str) {

        return str.substring(1) + str.substring(0, 1);

    }

    public static boolean isRotate(String strA, String strB) {
        if (strA.equals(strB)) return true;
        for (int i = 0; i < strA.length(); i++) {
            strA = rotateString(strA);
            if (strA.equals(strB)) return true;
        }
        return false;
    }
}

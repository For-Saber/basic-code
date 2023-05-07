package com.itheima.stringdemo;

public class StringBuilderDemo2 {
    //链式编程
    //依赖前一个方法的返回值，直接进行后续方法的调用
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();

        sb.append("aaa").append("bbb").append("ccc").append("ddd");
        System.out.println(sb);
    }

}

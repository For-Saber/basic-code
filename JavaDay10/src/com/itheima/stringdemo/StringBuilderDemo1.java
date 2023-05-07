package com.itheima.stringdemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {

        //拼接或者反转字符串时，一般借助StirngBuilder(不直接操作字符串)
        StringBuilder sb=new StringBuilder();
        sb.append("abc");
        sb.reverse();
        //打印StringBuilder时打印的是容器内的属性值
        String str=sb.toString();
        System.out.println(str);
    }


}

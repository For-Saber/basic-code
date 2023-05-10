package com.itheima.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        //泛型：集合中存储数据的类型
        //集合在底层有处理，打印时会在两端加[]，并且打印的不是地址值

        ArrayList<String> list=new ArrayList<>();

        list.add("aaa");//永远返回true
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        list.remove("aaa");

        System.out.println(list);
    }
}

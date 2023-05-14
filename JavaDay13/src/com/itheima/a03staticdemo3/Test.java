package com.itheima.a03staticdemo3;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("小北", "男", 21);
        Student stu2 = new Student("呱呱", "女", 19);
        Student stu3 = new Student("罗卓珩", "女", 20);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int maxAge = StudentUtil.getMaxAge(list);
        System.out.println(maxAge);
    }
}

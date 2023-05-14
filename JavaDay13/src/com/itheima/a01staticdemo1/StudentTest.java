package com.itheima.a01staticdemo1;

public class StudentTest {

    public static void main(String[] args) {

        Student.teacherName="阿玮老师";

        Student s1=new Student("张三",23,"男");
        s1.study();
        s1.show();

        Student s2=new Student("李四",22,"男");
        s2.study();
        s2.show();

    }
}

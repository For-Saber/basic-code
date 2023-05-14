package com.itheima.a01staticdemo1;

public class Student {

    private String name;
    private int age;
    private String gender;
    public static String teacherName;//此类所有的对象都共享同一个老师姓名（属性）

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

//    public String getTeacherName() {
//        return teacherName;
//    }
//
//    public void setTeacherName(String teacherName) {
//        this.teacherName = teacherName;
//    }

    public void study(){
        System.out.println(name+"：学习？学个屁！");
    }

    public void show(){
        System.out.println(name+"  "+age+"  "+gender+"  "+teacherName);
    }
}

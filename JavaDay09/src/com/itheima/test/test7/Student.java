package com.itheima.test.test7;

public class Student {

    private String id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

//    public void getInfo() {
//        System.out.println("学号：" + this.getId() + " " + "姓名：" + this.getName() + " " + "年龄：" + this.getAge());
//    }

}

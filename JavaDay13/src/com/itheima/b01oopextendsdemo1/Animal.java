package com.itheima.b01oopextendsdemo1;

public class Animal {

    private String name;
    private int age;
    private String color;

    public Animal() {
    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat() {
        System.out.println("吃东西");
    }

    public void drink() {
        System.out.println("喝水");
    }

    public void cry(){
        System.out.println("动物都会叫");
    }
}

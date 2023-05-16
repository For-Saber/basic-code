package com.itheima.b01oopextendsdemo1;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }

    @Override
    public void cry() {
        System.out.println("喵喵喵");
    }
}

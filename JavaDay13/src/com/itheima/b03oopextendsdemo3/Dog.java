package com.itheima.b03oopextendsdemo3;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println("吃" + something);
    }

    public void watchHouse() {
        System.out.println("狗在看家");
    }
}

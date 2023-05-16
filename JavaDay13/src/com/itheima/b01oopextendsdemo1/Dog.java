package com.itheima.b01oopextendsdemo1;

public class Dog extends Animal {

    private String bark;

    public Dog() {
    }

    public Dog(String name, int age, String color, String bark) {
        super(name, age, color);
        setBark(bark);
    }

    public String getBark() {
        return bark;
    }

    public void setBark(String bark) {
        this.bark = bark;
    }

    public void watchHouse() {
        System.out.println("看家");
    }

    @Override
    public void cry() {
        System.out.println("汪汪汪");
    }
}

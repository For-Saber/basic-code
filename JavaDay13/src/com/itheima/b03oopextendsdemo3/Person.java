package com.itheima.b03oopextendsdemo3;

public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void keepPet(Dog dog, String something) {
        System.out.print("颜色为" + dog.getColor() + "色的" + dog.getAge() + "岁的狗，在");
        dog.eat(something);
    }

    public void keepPet(Cat cat, String something) {
        System.out.print("颜色为" + cat.getColor() + "色的" + cat.getAge() + "岁的猫，在");
        cat.eat(something);
    }
}

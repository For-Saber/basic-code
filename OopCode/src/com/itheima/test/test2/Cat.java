package com.itheima.test.test2;

public class Cat {

    private String color;
    private String breed;

    public Cat() {
    }

    public Cat(String color, String breed) {
        setColor(color);
        setBreed(breed);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return this.color;
    }

    public String getBreed() {
        return this.breed;
    }

    public void eat() {
        System.out.println("吃鱼");
    }

    public void catchMouse() {
        System.out.println("抓老鼠");
    }

}

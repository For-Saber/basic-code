package com.itheima.test.test2;

public class Dog {

    private String color;
    private String breed;

    public Dog() {
    }

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    /**
     * 获取
     *
     * @return color
     */
    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取
     *
     * @return breed
     */
    public String getBreed() {
        return breed;
    }


    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void eat() {
        System.out.println("啃骨头");
    }

    public void watchHome() {
        System.out.println("看家");
    }
}

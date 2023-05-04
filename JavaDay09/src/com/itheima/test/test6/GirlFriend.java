package com.itheima.test.test6;

public class GirlFriend {

    private String name;
    private int age;
    private char gender;
    private String hobby;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.gender = '女';
        this.hobby = hobby;
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

    public char getGender() {
        return gender;
    }

    public void setGender() {
        this.gender = '女';
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}

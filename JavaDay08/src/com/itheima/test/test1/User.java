package com.itheima.test.test1;

public class User {

    private String username;
    private String password;
    //  private String confirmpass;
    private String email;
    private char gender;
    private int age;

    //空参构造
    public User() {
    }

    //全参构造
    public User(String username, String password, String email, char gender, int age) {
        this.username = username;
        this.password = password;
//      this.confirmpass=confirmpass;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public  void setUsername(String username){
        this.username=username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}

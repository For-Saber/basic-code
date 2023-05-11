package com.itheima.studentsystem;

public class User {

    private String username;
    private String password;
    private String IDnum;
    private String phonenum;

    public User() {
    }

    public User(String username, String password, String IDnum, String phonenum) {
        this.username = username;
        this.password = password;
        this.IDnum = IDnum;
        this.phonenum = phonenum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIDnum() {
        return IDnum;
    }

    public void setIDnum(String IDnum) {
        this.IDnum = IDnum;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }
}

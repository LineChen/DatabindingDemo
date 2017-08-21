package com.linechen.databindingdemo.bean;

/**
 * Created by LineChen on 2017/8/21.
 */

public class User {
    private String userName;
    private int age;
    private boolean isGirl;

    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public User(String userName, int age, boolean isGirl) {
        this.userName = userName;
        this.age = age;
        this.isGirl = isGirl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGirl() {
        return isGirl;
    }

    public void setGirl(boolean girl) {
        isGirl = girl;
    }
}

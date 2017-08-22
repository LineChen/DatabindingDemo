package com.linechen.databindingdemo.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.linechen.databindingdemo.BR;

/**
 * Created by chenliu on 17/8/22.
 */

public class ObservableUser extends BaseObservable {

    private String userName;
    private int age;
    private boolean isGirl;


    @Bindable
    public String getUserName() {
        return userName;
    }

    @Bindable
    public int getAge() {
        return age;
    }

    @Bindable
    public boolean isGirl() {
        return isGirl;
    }


    public void setUserName(String userName) {
        this.userName = userName;
        notifyPropertyChanged(BR.userName);
    }


    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }


    public void setGirl(boolean girl) {
        isGirl = girl;
        notifyPropertyChanged(BR.girl);
    }


}

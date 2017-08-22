package com.linechen.databindingdemo.bean;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by chenliu on 17/8/22.
 */

public class PlainUser {

    ObservableField<String> userName = new ObservableField<>();
    ObservableInt age = new ObservableInt();
    ObservableBoolean isGirl = new ObservableBoolean();
}

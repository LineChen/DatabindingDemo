package com.linechen.databindingdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.linechen.databindingdemo.bean.User;
import com.linechen.databindingdemo.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        final User user = new User("line", 23, true);
        binding.setUser(user);
        binding.setClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "name：" + user.getUserName(), Toast.LENGTH_SHORT).show();
            }
        });

        user.setUserName("chen");
        binding.userName.setText(user.getUserName());

    }
}

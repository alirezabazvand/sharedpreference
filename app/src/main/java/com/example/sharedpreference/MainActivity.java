package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    UserSetting userSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userSettings = new UserSetting(this);
        Toast.makeText(this, "email : " + userSettings.getSharePrefEmail() + " , User :" + userSettings.getSharedPrefUser(), Toast.LENGTH_SHORT).show();

    }

}
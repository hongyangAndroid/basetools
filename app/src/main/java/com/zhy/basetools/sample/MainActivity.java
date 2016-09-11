package com.zhy.basetools.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhy.basetools.L;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        L.e("Hello, %s ", "Hyman");
    }
}

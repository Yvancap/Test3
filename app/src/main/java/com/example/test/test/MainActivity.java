package com.example.test.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test();
        Log.d("Monapp","Fais chié");
    }

    public void test(){
        Log.d("mon app", "ceci est un test");
    }
}

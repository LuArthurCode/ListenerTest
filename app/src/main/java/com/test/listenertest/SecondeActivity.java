package com.test.listenertest;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondeActivity extends AppCompatActivity {

    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconde);
        Toolbar toolbar = findViewById(R.id.toolbar);
        button = findViewById(R.id.seBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondeActivity.this,ThreeActivity.class));
            }
        });
        init();

        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                finish();
            }
        });
    }

    private void init() {
        Log.d("TAG", "init:   进入了第二个页面了");
        UserListener secondListener = new UserListener() {
            @Override
            public void Success(String msg) {
                Log.d("TAG", "Success:  SecondActivity    secondListener   msg:"+msg);
            }

            @Override
            public void Error(int code, String msg) {
                Log.d("TAG", "Error:  SecondActivity    secondListener   code:"+code+"    msg:"+msg);
            }
        };
        CallBackListener.setSecondListener(secondListener);
        CallBackListener.callBackSuccess(this,"这是第二个页面来的");
    }
}
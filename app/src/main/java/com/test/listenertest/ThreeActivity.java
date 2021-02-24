package com.test.listenertest;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class ThreeActivity extends AppCompatActivity {

    public Button threeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        threeBtn = findViewById(R.id.button);

        init();

        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(ThreeActivity.this,FourActivity.class));
                CallBackListener.callBackSuccess(ThreeActivity.this,"我是第三个activity  返回来的数据哈哈哈"+ThreeActivity.class.getName());
            }
        });
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
        CallBackListener.callBackSuccess(this,"这个是第三个页面过来的");

    }
}
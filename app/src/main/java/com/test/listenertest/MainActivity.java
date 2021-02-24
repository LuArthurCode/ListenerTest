package com.test.listenertest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button second,three,four;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        second = findViewById(R.id.secondlis);
        three = findViewById(R.id.threelis);
        four = findViewById(R.id.fourlis);


        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SecondeActivity.class));
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ThreeActivity.class));
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,FourActivity.class));
            }
        });
        init();

    }

    private void init() {
        UserListener mainListener = new UserListener() {
            @Override
            public void Success(String msg) {
                Log.d("TAG", "Success:  mainActivity "+msg);
            }
            @Override
            public void Error(int code, String msg) {
                Log.d("TAG", "Error:  mainActivity code:"+code+"   msg:"+msg);
            }
        };
        CallBackListener.setMainListener(mainListener);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG", "Main   onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG", "Main  onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG", "Main   onDestroy: ");
    }
}
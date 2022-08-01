package com.example.onetwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t1, t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        Intent intent = getIntent();
        String tt1 = intent.getStringExtra("name");
        String tt2 = intent.getStringExtra("pswd");
        t1.setText(tt1);
        t2.setText(tt2);
        Log.i("Debug","On Start");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Debug","On Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Debug","On Resume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Debug","On Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Debug","On Destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Debug","On Pause");
    }
}
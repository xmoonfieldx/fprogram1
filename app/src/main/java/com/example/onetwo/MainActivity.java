package com.example.onetwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button toast, button;
    EditText et1, et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toast=findViewById(R.id.toast);
        button=findViewById(R.id.button);
        et1=findViewById(R.id.name);
        et2=findViewById(R.id.pswd);

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Toast",Toast.LENGTH_LONG).show();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String e1 = et1.getText().toString();
                String e2 = et2.getText().toString();
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("name",e1);
                intent.putExtra("pswd",e2);
                startActivity(intent);
            }
        });
    }
}
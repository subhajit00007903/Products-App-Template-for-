package com.example.activities_layout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView tvo,tvt,tvT,tvF;
        Button btn,btn2;
        btn = findViewById(R.id.btn);
        btn2 = findViewById(R.id.btn2);
        tvo  =findViewById(R.id.tv1);
        tvt =  findViewById(R.id.tv2);
        tvT  =findViewById(R.id.tv3);
        tvF =  findViewById(R.id.tv4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = tvo.getText().toString();
                String b = tvt.getText().toString();


                Toast.makeText(MainActivity.this, a+" "+" "+b, Toast.LENGTH_SHORT).show();

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = tvT.getText().toString();
                String d = tvF.getText().toString();
                Toast.makeText(MainActivity.this, c+" "+" "+d, Toast.LENGTH_SHORT).show();
            }
        });










    }
}
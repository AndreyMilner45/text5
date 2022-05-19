package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {
    Button button3, button4;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        this.view = view;
        if (view.getId() == R.id.button3) {
            Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
            MainActivity3.this.startActivity(intent);

        }
        if (view.getId() == R.id.button4) {
            Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
            MainActivity3.this.startActivity(intent);
        }

    }
}
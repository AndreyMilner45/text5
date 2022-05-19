package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener{
    Button button11;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        this.view = view;
        if (view.getId() == R.id.button11) {
            Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
            MainActivity4.this.startActivity(intent);
        }
    }
}
package com.example.restuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button backToMainButton = findViewById(R.id.backToMainButton);
        backToMainButton.setOnClickListener(view -> {
            Intent backToMain = new Intent(MenuActivity.this, MainActivity.class);
            startActivity(backToMain);
        });

    }
}
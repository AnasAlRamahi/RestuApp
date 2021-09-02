package com.example.restuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addDishButton = findViewById(R.id.addDishButton);
        addDishButton.setOnClickListener(view -> {
            Intent goToAddDish = new Intent(MainActivity.this, AddDishActivity.class);
            startActivity(goToAddDish);
        });

        Button menuButton = findViewById(R.id.menuButton);
        menuButton.setOnClickListener(view -> {
            Intent goToMenu = new Intent(MainActivity.this, MenuActivity.class);
            startActivity(goToMenu);
        });
    }
}
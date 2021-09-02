package com.example.restuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class addDishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_dish);


        Button submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(view -> {
            Intent goToAddDish = new Intent(addDishActivity.this, MainActivity.class);
            startActivity(goToAddDish);
        });

    }
}
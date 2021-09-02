package com.example.restuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class DishDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dish_details);

        Button backToMainButton = findViewById(R.id.backToMainButton);
        backToMainButton.setOnClickListener(view -> {
            Intent backToMain = new Intent(DishDetails.this, MainActivity.class);
            startActivity(backToMain);
        });

            Intent intent = getIntent();
            String dishName = intent.getExtras().getString("name");
            int dishPrice = intent.getExtras().getInt("price");
            String ingredients = intent.getExtras().getString("ingredients");

            TextView name = findViewById(R.id.dishNameView);
            name.setText(dishName);
            TextView price = findViewById(R.id.dishPriceView);
            price.setText(Integer.toString(dishPrice));
            TextView ingreds = findViewById(R.id.ingredientsView);
            ingreds.setText(ingredients);
    }
}
package com.example.restuapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class AddDishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_dish);

        Button backToMainButton = findViewById(R.id.backToMainButton);
        backToMainButton.setOnClickListener(view -> {
            Intent backToMain = new Intent(AddDishActivity.this, MainActivity.class);
            startActivity(backToMain);
        });

        Button submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(view -> {
            DishDatabase db = Room.databaseBuilder(getApplicationContext(), DishDatabase.class, "DB").allowMainThreadQueries().build();
            DishDao dishDao = db.dishDao();

            TextView dishName = findViewById(R.id.dishNameEntery);
            String name = dishName.getText().toString();
            TextView dishPrice = findViewById(R.id.dishPriceEntery);
            int price = Integer.parseInt(dishPrice.getText().toString());
            TextView ingredients = findViewById(R.id.ingredientsEntery);
            String ingreds = ingredients.getText().toString();
            dishDao.insert(new Dish(name,price,ingreds));

            Intent goToAddDish = new Intent(AddDishActivity.this, MainActivity.class);
            startActivity(goToAddDish);
        });

    }
}
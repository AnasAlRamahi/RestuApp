package com.example.restuapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

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


//        List<Dish> DishItems = new ArrayList<Dish>(); // get from room
//        DishItems.add(new Dish("FIRST",3,"@#"));
//        DishItems.add(new Dish("SECOND",3,"@#"));
//        DishItems.add(new Dish("THIRD",3,"@#"));
//        DishItems.add(new Dish("FOURTH",3,"@#"));

        DishDatabase db = Room.databaseBuilder(getApplicationContext(), DishDatabase.class, "MenuActivity").allowMainThreadQueries().build();
        DishDao dishDao = db.dishDao();

        List<Dish> DishItems = dishDao.getAll();


        RecyclerView dishRecyclerView = findViewById(R.id.dishRecyclerView);
        dishRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        dishRecyclerView.setAdapter(new DishAdapter(DishItems));

    }
}
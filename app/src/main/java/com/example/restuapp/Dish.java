package com.example.restuapp;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Dish {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "dish_name")
    public String dishName;
    @ColumnInfo(name = "dish_price")
    public int dishPrice;
    @ColumnInfo(name = "ingredients")
    public String ingredients;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Dish(String dishName, int dishPrice, String ingredients) {
        this.dishName = dishName;
        this.dishPrice = dishPrice;
        this.ingredients = ingredients;
    }
}

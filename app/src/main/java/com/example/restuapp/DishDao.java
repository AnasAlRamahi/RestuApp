package com.example.restuapp;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DishDao {
    @Insert
    void insert(Dish dish);

    @Query("SELECT * FROM Dish")
    List<Dish> getAll();

    @Delete
    void delete(Dish dish);
}

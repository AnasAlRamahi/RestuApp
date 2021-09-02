package com.example.restuapp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class DishAdapter extends RecyclerView.Adapter<DishAdapter.DishViewHolder> {

    List<Dish> dishItems = new ArrayList<Dish>();

    public DishAdapter(List<Dish> dishItems) {
        this.dishItems = dishItems;
    }

    public static class DishViewHolder extends RecyclerView.ViewHolder {
        public Dish dish;
        View itemView;

        public DishViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;
            itemView.setOnClickListener(view -> {
                Intent intent = new Intent(view.getContext(), DishDetails.class);
                intent.putExtra("name",dish.dishName);
                intent.putExtra("price",dish.dishPrice);
                intent.putExtra("ingredients",dish.ingredients);
                view.getContext().startActivity(intent);
            });

        }
    }

    @NotNull
    @Override
    public DishAdapter.DishViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_dish,parent, false);
        DishViewHolder dishViewHolder = new DishViewHolder(view);
        return dishViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DishAdapter.DishViewHolder holder, int position) {
        holder.dish = dishItems.get(position);
        TextView dishName = holder.itemView.findViewById(R.id.dishNameView);
        dishName.setText(holder.dish.dishName);
        TextView dishPrice = holder.itemView.findViewById(R.id.dishPriceView);
        dishPrice.setText(Integer.toString(holder.dish.dishPrice));
    }

    @Override
    public int getItemCount() {
        return dishItems.size();
    }
}

package com.example.restuapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DishFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DishFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "dishName";
    private static final String ARG_PARAM2 = "dishPrice";
    private static final String ARG_PARAM3 = "ingredients";

    // TODO: Rename and change types of parameters
    private String mDishName;
    private int mDishPrice;
    private String mIngredients;

    public DishFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param dishName Parameter 1.
     * @param dishPrice Parameter 2.
     * @param ingredients Parameter 3.
     * @return A new instance of fragment DishFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DishFragment newInstance(String dishName, int dishPrice, String ingredients) {
        DishFragment fragment = new DishFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, dishName);
        args.putInt(ARG_PARAM2, dishPrice);
        args.putString(ARG_PARAM3, ingredients);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mDishName = getArguments().getString(ARG_PARAM1);
            mDishPrice = getArguments().getInt(ARG_PARAM2);
            mIngredients = getArguments().getString(ARG_PARAM3);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dish, container, false);
    }
}
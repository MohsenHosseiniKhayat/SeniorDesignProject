package com.cmpe195.mohsenhosseinikhayat.seniordesignproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class IngredientDetailActivity extends AppCompatActivity {

    private TextView ingredientNameTextView;
    private TextView ingredientQuantityTextView;
    private TextView ingredientMeasurementUnitTextView;
    private IngredientDetailViewModel viewModel;
    private Ingredient ingredient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredient_detail);
        String nameOfIngredient = getIntent().getStringExtra("ingredientName");
        viewModel = new IngredientDetailViewModel(nameOfIngredient);
        ingredient = viewModel.getIngredient();
        setupView();
    }

    private void setupView() {
        ingredientNameTextView = (TextView) findViewById(R.id.ingredientNameTextView);
        ingredientMeasurementUnitTextView = (TextView) findViewById(R.id.ingredientMeasurementUnitTextView);
        ingredientQuantityTextView = (TextView) findViewById(R.id.ingredientQuantityTextView);

        ingredientNameTextView.setText(ingredient.getName());
        ingredientMeasurementUnitTextView.setText(ingredient.getMeasuringUnit().toString().toLowerCase());
        ingredientQuantityTextView.setText(String.valueOf(ingredient.getQuantity()));
    }
}

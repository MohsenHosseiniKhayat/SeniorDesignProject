package com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Models.Ingredient;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.ViewModels.IngredientDetailViewModel;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.R;

import app.minimize.com.seek_bar_compat.SeekBarCompat;

public class IngredientDetailActivity extends AppCompatActivity {

    private TextView nameTextView;
    private TextView quantityTextView;
    private TextView measurementUnitTextView;
    private ImageView imageView;
    private SeekBarCompat alertSeekBar;
    private IngredientDetailViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String nameOfIngredient = getIntent().getStringExtra("ingredientName");
        model = new IngredientDetailViewModel(nameOfIngredient);
        setupView();
    }

    /**
     * Retrieves views and performs their setup
     */
    private void setupView() {
        setContentView(R.layout.activity_ingredient_detail);
        nameTextView = (TextView) findViewById(R.id.ingredientNameTextView);
        measurementUnitTextView = (TextView) findViewById(R.id.ingredientMeasurementUnitTextView);
        quantityTextView = (TextView) findViewById(R.id.ingredientQuantityTextView);
        imageView = (ImageView) findViewById(R.id.recipeImageView);
        alertSeekBar = (SeekBarCompat) findViewById(R.id.alertSeekBar);

        nameTextView.setText(model.getName());
        measurementUnitTextView.setText(model.getMeasurementUnit().toString().toLowerCase());
        quantityTextView.setText(String.valueOf(model.getQuantity()));
        imageView.setImageResource(R.mipmap.hamburger);
        alertSeekBar.setProgress(model.getAlertQuantity());
        alertSeekBar.setMax(model.getMaxAlertQuantity());

        if (model.getMaxAlertQuantity() == 0)
        {
            alertSeekBar.setEnabled(false);
        }
        alertSeekBar.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View view, DragEvent dragEvent) {
                model.updateAlertQuantity(alertSeekBar.getProgress());
                return false;
            }
        });
    }
}

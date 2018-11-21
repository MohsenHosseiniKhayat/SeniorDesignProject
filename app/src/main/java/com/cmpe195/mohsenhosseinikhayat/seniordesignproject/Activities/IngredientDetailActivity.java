package com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.ViewModels.IngredientDetailViewModel;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.R;
import com.xw.repo.BubbleSeekBar;

public class IngredientDetailActivity extends AppCompatActivity {

    private TextView nameTextView;
    private TextView quantityTextView;
    private TextView measurementUnitTextView;
    private ImageView imageView;
    private BubbleSeekBar alertSeekBar;
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
        imageView = (ImageView) findViewById(R.id.ingredientImageView);
        alertSeekBar = (BubbleSeekBar) findViewById(R.id.alertSeekBar);

        nameTextView.setText(model.getName());
        measurementUnitTextView.setText(model.getMeasurementUnit().toString().toLowerCase());
        quantityTextView.setText(String.valueOf(model.getQuantity()));
        imageView.setImageResource(R.mipmap.hamburger);
        alertSeekBar.setProgress(model.getAlertQuantity());
        alertSeekBar.setOnProgressChangedListener(new BubbleSeekBar.OnProgressChangedListener() {
            @Override
            public void onProgressChanged(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat) {
                model.updateAlertQuantity(alertSeekBar.getProgress());
            }

            @Override
            public void getProgressOnActionUp(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat) {
            }
            @Override
            public void getProgressOnFinally(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat) {
            }
        });
        alertSeekBar.getConfigBuilder().max(model.getMaxAlertQuantity());

        if (model.getMaxAlertQuantity() == 0)
        {
            alertSeekBar.setEnabled(false);
        }
    }
}

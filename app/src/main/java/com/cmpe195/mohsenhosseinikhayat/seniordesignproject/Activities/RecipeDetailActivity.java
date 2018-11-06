package com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Adapters.CookingStepsRecyclerAdapter;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Adapters.RecipeIngredientsGridViewAdapter;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Models.Recipe;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.R;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.ViewModels.RecipeDetailViewModel;

public class RecipeDetailActivity extends AppCompatActivity {

    private TextView recipeNameTextView;
    private GridView ingredientsGridView;
    private RecyclerView cookingStepsRecyclerView;
    private ImageView recipeImageView;
    private CookingStepsRecyclerAdapter cookingStepsRecyclerAdapter;
    private RecipeIngredientsGridViewAdapter recipeIngredientsGridViewAdapter;
    private RecipeDetailViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        String recipeName = getIntent().getStringExtra("recipeName");
        model = new RecipeDetailViewModel(recipeName);

        setupView();
    }

    private void setupView()
    {
        setContentView(R.layout.activity_recipe_detail);

        recipeNameTextView = (TextView) findViewById(R.id.recipeNameTextView);
        ingredientsGridView = (GridView) findViewById(R.id.ingredientsGridView);
        cookingStepsRecyclerView = (RecyclerView) findViewById(R.id.cookingStepsRecyclerView);
        recipeImageView = (ImageView) findViewById(R.id.recipeImageView);

        recipeNameTextView.setText(model.getRecipeName());
        recipeImageView.setImageResource(R.mipmap.hamburger);
        cookingStepsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        recipeIngredientsGridViewAdapter = new RecipeIngredientsGridViewAdapter(this, model.getRecipeIngredients());
        recipeIngredientsGridViewAdapter.notifyDataSetChanged();
        ingredientsGridView.setAdapter(recipeIngredientsGridViewAdapter);

        cookingStepsRecyclerAdapter = new CookingStepsRecyclerAdapter(this, model.getCookingSteps());
        cookingStepsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        cookingStepsRecyclerAdapter.notifyDataSetChanged();

    }

}

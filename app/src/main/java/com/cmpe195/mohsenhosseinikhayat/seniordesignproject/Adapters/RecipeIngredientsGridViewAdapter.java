package com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Models.Ingredient;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Models.Recipe;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.R;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class RecipeIngredientsGridViewAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private ArrayList<Ingredient> ingredientsList;
    private LinkedHashMap<Ingredient, Double> ingredients;

    public RecipeIngredientsGridViewAdapter(Context context, LinkedHashMap<Ingredient, Double> ingredients)
    {
        this.inflater = LayoutInflater.from(context);
        this.ingredients = ingredients;
        this.ingredientsList = new ArrayList<>(ingredients.keySet());
    }

    @Override
    public int getCount() {
        return ingredientsList.size();
    }

    @Override
    public Object getItem(int i) {
        return ingredientsList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        View cellView = inflater.inflate(R.layout.ingredient_grid_view_cell_layout, viewGroup,false);

        TextView nameTextView =  (TextView) cellView.findViewById(R.id.ingredientNameTextView);
        TextView quantityTextView =  (TextView) cellView.findViewById(R.id.ingredientQuantityTextView);

        nameTextView.setText(ingredientsList.get(i).getName());
        quantityTextView.setText(String.valueOf(ingredientsList.get(i).getQuantity()));

        return cellView;
    }
}

package com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Adapters.RecipeSearchRecyclerAdapter;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Models.Recipe;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.R;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.ViewModels.RecipeSearchViewModel;
import com.malinskiy.superrecyclerview.SuperRecyclerView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecipeSearchFragment extends Fragment implements RecipeSearchRecyclerAdapter.ItemClickListener {


    private RecipeSearchViewModel model;
    private SuperRecyclerView recipeSearchRecyclerView;
    private RecipeSearchRecyclerAdapter recipeSearchRecyclerAdapter;
    private SearchView recipeSearchView;
    private ArrayList<Recipe> resultRecipes;

    public RecipeSearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_recipe_search, container, false);
        model = new RecipeSearchViewModel();
        setupView(view);

        return view;
    }

    private void setupView(View view)
    {
        recipeSearchView = (SearchView) view.findViewById(R.id.recipeSearchView);
        resultRecipes = new ArrayList<>();
        recipeSearchRecyclerView = (SuperRecyclerView) view.findViewById(R.id.recipeSearchRecyclerView);
        recipeSearchRecyclerAdapter = new RecipeSearchRecyclerAdapter(this.getActivity(), resultRecipes);
        recipeSearchRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        recipeSearchRecyclerView.setAdapter(recipeSearchRecyclerAdapter);
        recipeSearchRecyclerAdapter.notifyDataSetChanged();
        recipeSearchRecyclerAdapter.setOnClickListener(this);

        recipeSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                performSearch();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });
    }

    @Override
    public void onItemClick(View view, int position) {
        //Launch recipe detail activity or fragment
    }

    private void performSearch()
    {
        // This will be determined by a drop down or something else later
        String searchOption = "Name";
        String queryString = recipeSearchView.getQuery().toString();

        switch (searchOption) {
            case "Ingredient":
                resultRecipes = model.SearchRecipeByIngredient(queryString);
                break;
            case "Tag":
                resultRecipes = model.SearchRecipeByTag(queryString);
                break;
            case "Calories":
                resultRecipes = model.SearchRecipeByCalories(queryString);
                break;
            default:
                resultRecipes = model.SearchRecipeByName(queryString);
                break;
        }

        recipeSearchRecyclerAdapter = new RecipeSearchRecyclerAdapter(this.getActivity(), resultRecipes);
        recipeSearchRecyclerAdapter.notifyDataSetChanged();
        recipeSearchRecyclerView.setAdapter(recipeSearchRecyclerAdapter);
        recipeSearchRecyclerView.hideProgress();
    }
}

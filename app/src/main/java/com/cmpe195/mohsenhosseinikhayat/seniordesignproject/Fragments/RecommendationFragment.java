package com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.SearchView;

import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Activities.RecipeDetailActivity;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Adapters.RecommendationRecyclerAdapter;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.CustomViews.Animations;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Models.Ingredient;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Models.Recipe;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.R;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.ViewModels.HomeViewModel;
import com.malinskiy.superrecyclerview.SuperRecyclerView;

import java.util.LinkedHashMap;

public class RecommendationFragment extends Fragment implements RecommendationRecyclerAdapter.ItemClickListener {
    private HomeViewModel model;

    private SuperRecyclerView recommendationRecyclerView;
    private RecommendationRecyclerAdapter recommendationRecyclerAdapter;
    private LinkedHashMap<Recipe, Double> recipes;

    public RecommendationFragment()
    {
        // Required empty public constructor
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_recommendation, container, false);
        model = new HomeViewModel();
        setupView(view);

        return view;
    }

    public void setupView(View view)
    {
        recommendationRecyclerView = (SuperRecyclerView) view.findViewById(R.id.recommendationRecyclerView);
        recipes = model.recommendRecipes();
        recommendationRecyclerAdapter = new RecommendationRecyclerAdapter(this.getActivity(), recipes);
        recommendationRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        recommendationRecyclerAdapter.setOnClickListener(this);
        recommendationRecyclerView.setAdapter(recommendationRecyclerAdapter);
        recommendationRecyclerAdapter.notifyDataSetChanged();


        Animations.AnimateRecyclerView(recommendationRecyclerView);
    }

    @Override
    public void onItemClick(View view, int position) {
        Intent intent = new Intent(this.getActivity(), RecipeDetailActivity.class);
        String selectedRecipeName = recipes.keySet().toArray(new Recipe[0])[0].getName();
        intent.putExtra("recipeName", selectedRecipeName);
        this.getActivity().startActivity(intent);
    }
}

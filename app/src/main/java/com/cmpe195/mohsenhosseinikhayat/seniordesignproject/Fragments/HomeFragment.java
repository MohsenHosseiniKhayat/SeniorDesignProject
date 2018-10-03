package com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Adapters.RecommendationRecyclerAdapter;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Models.Recipe;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.R;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.ViewModels.RecommendationViewModel;
import com.malinskiy.superrecyclerview.SuperRecyclerView;

import java.util.LinkedHashMap;

public class HomeFragment extends Fragment implements RecommendationRecyclerAdapter.ItemClickListener{

    private RecommendationViewModel model;
    private SuperRecyclerView recipeRecommendationSuperRecyclerView;
    private LinkedHashMap<Recipe, Double> recommendedRecipes;
    private RecommendationRecyclerAdapter recommendationRecyclerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, true);
        model = new RecommendationViewModel();
        recommendedRecipes = model.recommendRecipes();
        setupView(view);



        return super.onCreateView(inflater, container, savedInstanceState);
    }

    private void setupView(View view)
    {
        recipeRecommendationSuperRecyclerView = (SuperRecyclerView) view.findViewById(R.id.recommendationSuperRecyclerView);
        recommendationRecyclerAdapter = new RecommendationRecyclerAdapter(this.getActivity(), recommendedRecipes);
        recipeRecommendationSuperRecyclerView.setAdapter(recommendationRecyclerAdapter);
        recipeRecommendationSuperRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        recommendationRecyclerAdapter.setOnClickListener(this);
        recommendationRecyclerAdapter.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(View view, int position) {
        //Launch Recipe Detail View after user click
    }
}

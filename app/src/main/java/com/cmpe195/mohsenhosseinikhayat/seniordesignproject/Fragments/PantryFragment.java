package com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Adapters.PantryManagerRecyclerAdapter;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Adapters.PantryManagerRecyclerAdapter.ItemClickListener;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Interfaces.UpdatableFragment;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Models.Ingredient;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.R;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.ViewModels.PantryManagerViewModel;
import com.malinskiy.superrecyclerview.SuperRecyclerView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PantryFragment extends Fragment implements PantryManagerRecyclerAdapter.ItemClickListener{

    private PantryManagerViewModel model;
    private ArrayList<Ingredient> myIngredients;
    private SuperRecyclerView pantryManagerSuperRecyclerView;
    private PantryManagerRecyclerAdapter pantryManagerRecyclerAdapter;
    private Button updatePantryManagerButton;

    public PantryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_pantry_manager, container, false);

        model = new PantryManagerViewModel();
        myIngredients = model.getMyIngredients();
        setupView(view);


        return inflater.inflate(R.layout.fragment_pantry_manager, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        myIngredients = model.getMyIngredients();
        pantryManagerSuperRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        pantryManagerRecyclerAdapter = new PantryManagerRecyclerAdapter(this.getActivity(), myIngredients);
        pantryManagerSuperRecyclerView.setAdapter(pantryManagerRecyclerAdapter);
        pantryManagerRecyclerAdapter.setOnClickListener(this);
        pantryManagerRecyclerAdapter.notifyDataSetChanged();
    }

    private void setupView(View view)
    {
        pantryManagerSuperRecyclerView = (SuperRecyclerView) view.findViewById(R.id.pantryManagerRecyclerView);
        pantryManagerSuperRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        pantryManagerRecyclerAdapter = new PantryManagerRecyclerAdapter(this.getActivity(), myIngredients);
        pantryManagerSuperRecyclerView.setAdapter(pantryManagerRecyclerAdapter);
        pantryManagerRecyclerAdapter.setOnClickListener(this);
        pantryManagerRecyclerAdapter.notifyDataSetChanged();

        updatePantryManagerButton = (Button) view.findViewById(R.id.updatePantryManager);
    }


    @Override
    public void onItemClick(View view, int position) {
        //Launch ingredient detail activity from here
    }
}

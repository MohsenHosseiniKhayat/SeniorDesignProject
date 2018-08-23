package com.cmpe195.mohsenhosseinikhayat.seniordesignproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.widget.Button;

public class PantryManagerActivity extends AppCompatActivity implements PantryManagerRecyclerAdapter.ItemClickListener {

    private Button goToAssistantButton;
    private RecyclerView pantryManagerRecyclerView;
    private PantryManagerViewModel viewModel;
    private PantryManagerRecyclerAdapter pantryManagerRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantry_manager);
        this.viewModel = new PantryManagerViewModel();
        setupView();
    }

    @Override
    public void onResume()
    {
        super.onResume();
        pantryManagerRecyclerAdapter = new PantryManagerRecyclerAdapter(this, viewModel.getMyIngredients());
        pantryManagerRecyclerAdapter.setOnClickListener(this);
        pantryManagerRecyclerView.setAdapter(pantryManagerRecyclerAdapter);
        pantryManagerRecyclerAdapter.notifyDataSetChanged();
    }

    private void setupView()
    {
        goToAssistantButton = (Button) findViewById(R.id.goToAssistantButton);
        goToAssistantButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PantryManagerActivity.this, PantryAssistantActivity.class);
                startActivity(intent)   ;
            }
        });

        pantryManagerRecyclerView = (RecyclerView) findViewById(R.id.pantryManagerRecyclerView);
        pantryManagerRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        pantryManagerRecyclerAdapter = new PantryManagerRecyclerAdapter(this, viewModel.getMyIngredients());
        pantryManagerRecyclerAdapter.setOnClickListener(this);
        pantryManagerRecyclerView.setAdapter(pantryManagerRecyclerAdapter);
        pantryManagerRecyclerAdapter.notifyDataSetChanged();

        ItemTouchHelper.SimpleCallback simpleItemTouchCallback = new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {

            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int swipeDir) {
                viewModel.deleteIngredient(viewHolder.getAdapterPosition());
                pantryManagerRecyclerAdapter.notifyDataSetChanged();
            }
        };

        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleItemTouchCallback);

        itemTouchHelper.attachToRecyclerView(pantryManagerRecyclerView);
    }

    @Override
    public void onItemClick(View view, int position) {
        Intent intent = new Intent(PantryManagerActivity.this, IngredientDetailActivity.class);
        intent.putExtra("ingredientName",  viewModel.getMyIngredients().get(position).getName());
        startActivity(intent);
    }
}

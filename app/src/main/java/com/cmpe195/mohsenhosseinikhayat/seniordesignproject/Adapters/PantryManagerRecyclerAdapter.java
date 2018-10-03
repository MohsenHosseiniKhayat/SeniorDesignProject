package com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Models.Ingredient;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.R;

import java.util.ArrayList;

public class PantryManagerRecyclerAdapter extends RecyclerView.Adapter<PantryManagerRecyclerAdapter.ViewHolder>{

    private ItemClickListener itemClickListener;
    private ArrayList<Ingredient> ingredientsList;
    private LayoutInflater inflater;

    int[] images = {R.mipmap.hamburger, R.mipmap.lasagna, R.mipmap.mushrooms,R.mipmap.potattoes,
            R.mipmap.salmon,R.mipmap.scallops,R.mipmap.shrimp2};

    public PantryManagerRecyclerAdapter(Context context, ArrayList<Ingredient> ingredientsList) {
        this.inflater = LayoutInflater.from(context);
        this.ingredientsList = ingredientsList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.pantry_row, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        Ingredient currentIngredient = ingredientsList.get(position);

        holder.ingredientNameTextView.setText(currentIngredient.getName());
        holder.ingredientQuantityTextView.setText(String.valueOf(currentIngredient.getQuantity()));
        holder.ingredientMeasurementUnitTextView.setText(String.valueOf(currentIngredient.getMeasuringUnit().toString().toLowerCase()));
        holder.ingredientImageView.setImageResource(images[position % 7]);
    }

    @Override
    public int getItemCount()
    {
        return ingredientsList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView ingredientNameTextView;
        private TextView ingredientMeasurementUnitTextView;
        private TextView ingredientQuantityTextView;
        private ImageView ingredientImageView;

        public ViewHolder(View itemView) {
            super(itemView);

            ingredientNameTextView = (TextView) itemView.findViewById(R.id.ingredientNameTextView);
            ingredientMeasurementUnitTextView = (TextView) itemView.findViewById(R.id.ingredientMeasurementUnitTextView);
            ingredientQuantityTextView = (TextView) itemView.findViewById(R.id.ingredientQuantityTextView);
            ingredientImageView = (ImageView) itemView.findViewById(R.id.ingredientImageView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (itemClickListener != null)
            {
                itemClickListener.onItemClick(v, getAdapterPosition());
            }
        }
    }

    public void setOnClickListener(ItemClickListener itemClickListener)
    {
        this.itemClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }

    public Ingredient getItem(int id)
    {
        return ingredientsList.get(id);
    }
}

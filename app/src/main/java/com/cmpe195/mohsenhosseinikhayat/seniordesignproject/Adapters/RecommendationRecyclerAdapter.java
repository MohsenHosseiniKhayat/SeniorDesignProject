package com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.Models.Recipe;
import com.cmpe195.mohsenhosseinikhayat.seniordesignproject.R;
import com.malinskiy.superrecyclerview.swipe.BaseSwipeAdapter;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class RecommendationRecyclerAdapter extends BaseSwipeAdapter<RecommendationRecyclerAdapter.ViewHolder> {

    private ItemClickListener itemClickListener;
    private ArrayList<Recipe> recipesList;
    private LayoutInflater inflater;
    private LinkedHashMap<Recipe, Double> recipes;
    private int[] images = {R.mipmap.hamburger, R.mipmap.lasagna, R.mipmap.mushrooms,R.mipmap.potattoes,
            R.mipmap.salmon,R.mipmap.scallops,R.mipmap.shrimp2};


    public RecommendationRecyclerAdapter(Context context, LinkedHashMap<Recipe, Double> recipes)
    {
        this.inflater = LayoutInflater.from(context);
        this.recipes = recipes;
        this.recipesList = new ArrayList<>(recipes.keySet());
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Recipe currentRecipe = recipesList.get(position);

        holder.nameTextView.setText(currentRecipe.getName());
        holder.descriptionTextView.setText(currentRecipe.getDescription());
        holder.completionTextView.setText(recipes.get(currentRecipe).toString());
        holder.ratingBar.setNumStars(3);

        // TODO: Remove this place holder here. Each recipe should have an image associated with it (figure it out later)
        holder.imageView.setImageResource(images[position % 7]);
        this.setOnClickListener(itemClickListener);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recommendation_cardview_row, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return recipesList.size();
    }


    public class ViewHolder extends BaseSwipeAdapter.BaseSwipeableViewHolder implements View.OnClickListener
    {
        private TextView nameTextView;
        private TextView descriptionTextView;
        private TextView completionTextView;
        private RatingBar ratingBar;
        private ImageView imageView;

        public ViewHolder(View itemView)
        {
            super(itemView);

            nameTextView = (TextView) itemView.findViewById(R.id.recipeNameTextView);
            descriptionTextView = (TextView) itemView.findViewById(R.id.recipeDescriptionTextView);
            completionTextView = (TextView) itemView.findViewById(R.id.recipeCompletionTextView);
            ratingBar = (RatingBar) itemView.findViewById(R.id.recipeRatingBar);
            imageView = (ImageView) itemView.findViewById(R.id.recipeImageView);
        }

        @Override
        public void onClick(View view) {
            if (itemClickListener != null)
            {
                itemClickListener.onItemClick(view, getAdapterPosition());
            }
        }
    }

    public void setOnClickListener(RecommendationRecyclerAdapter.ItemClickListener itemClickListener)
    {
        this.itemClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}